package com.olive.listener;

import java.util.Date;

import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobExecutionListener;

public class MyJobExecutionListener implements JobExecutionListener{


	public void beforeJob(JobExecution je) {
	 	
	System.out.println("Before Job Execution Status :: " +je.getStatus() );
	System.out.println("Start Time :: " + new Date());
	}

	
	public void afterJob(JobExecution je) {
		
	System.out.println("AFTER JOB Execution STATUS IS :: " + je.getStatus());
	}
	

}
