package com.lhh.quartz_demo.timerapp;

import java.util.*;

/**
 * Timer:java自带的java.util.Timer类，调度一个TimerTask任务
 * 不能指定时间运行，使用较少
 * @author 李弘昊
 * @since 2020/9/12
 */
public class TestTimer {
    public static void main(String[] args) {
        TimerTask timerTask = new TimerTask() {
            @Override
            public void run() {
                System.out.println("task run:" + new Date());
            }
        };
        Timer timer = new Timer();
        timer.schedule(timerTask,10,3000);
    }
}
