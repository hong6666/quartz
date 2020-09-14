package com.lhh.quartz_demo.schedule;

import java.util.ArrayList;

import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * ScheduledExecutorServiceApp
 *
 * @author 李弘昊
 * @since 2020/9/13
 */
public class ScheduledExecutorServiceApp {

    public static void main(String[] args) {

        List<Integer> A = new ArrayList<>();
        A.add(1);
        A.add(2);
        A.add(3);
        A.add(4);
        A.add(5);
        A.add(6);
        A.add(7);
        A.add(8);
        A.add(9);
        A.add(10);
        List<Integer> B = new ArrayList<>();
        ScheduledExecutorService service = Executors.newScheduledThreadPool(2);
        service.scheduleAtFixedRate(new Runnable() {
                                        int i = 0;
                                        @Override
                                        public void run() {
                                            System.out.println("第一 ###### A:" + A + "  B:" + B + "  A.size:" + A.size() + " B.size:" + B.size());
                                            B.add(A.remove(i));
                                        }
                                    },
                1, 1, TimeUnit.SECONDS);
        service.scheduleAtFixedRate(new Runnable() {
                                        @Override
                                        public void run() {
                                            System.out.println("第二 ###### B.size:" + B.size());
                                           if(B.size()%3 == 0) {
                                               System.out.println("b是三的倍数");
                                           }

                                        }
                                    },
                2, 2, TimeUnit.SECONDS);

    }

}
