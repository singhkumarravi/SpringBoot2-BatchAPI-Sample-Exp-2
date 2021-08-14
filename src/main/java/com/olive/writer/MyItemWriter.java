package com.olive.writer;

import java.util.List;

import org.springframework.batch.item.ItemWriter;

public class MyItemWriter implements ItemWriter<String> {
	
	public void write(List<? extends String> items) throws Exception {
	     System.out.println("Writer executed  ......");
		System.out.println("Data is ::>" + items);
	}

}
