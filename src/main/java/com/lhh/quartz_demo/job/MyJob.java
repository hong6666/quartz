package com.lhh.quartz_demo.job;

import org.quartz.Job;
import org.quartz.JobDetail;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

import java.util.Date;

/**
 * MyJob
 *
 * @author 李弘昊
 * @since 2020/8/1
 */
public class MyJob implements Job {

    @Override
    public void execute(JobExecutionContext context) throws JobExecutionException {
        //创建工作详情
        JobDetail detail  = context.getJobDetail();
        //获取工作的信息
        String name = detail.getKey().getName();
        String group = detail.getKey().getGroup();
        String job = detail.getJobDataMap().getString("data");
        System.out.println("job执行，job名: " + name + " group: " + group
                + "data:" + job + new Date());

    }
}
