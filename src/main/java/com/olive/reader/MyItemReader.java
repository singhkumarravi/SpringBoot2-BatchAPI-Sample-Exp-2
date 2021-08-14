package com.olive.reader;

import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.NonTransientResourceException;
import org.springframework.batch.item.ParseException;
import org.springframework.batch.item.UnexpectedInputException;

public class MyItemReader implements ItemReader<String> {
      String s[]= {"hellow","welcome","to","sringboot","api","demo","ok"};
	 int index=0;
	@Override
	public String read() throws Exception, UnexpectedInputException, ParseException, NonTransientResourceException {
	     if(index<s.length) {
	    	 System.out.println("From Reader .........");
	    	 return s[index++];
	     } 
	     else {
	    	  index=0;
	     }
		return null;
	}

}
