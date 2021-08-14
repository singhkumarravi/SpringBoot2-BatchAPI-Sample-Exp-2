package com.olive.process;

import org.springframework.batch.item.ItemProcessor;

public class MyItemProcessor implements ItemProcessor<String, String> {

	public String process(String item) throws Exception {
		System.out.println("Process data.......");
		return item.toUpperCase();
	}
	

}
