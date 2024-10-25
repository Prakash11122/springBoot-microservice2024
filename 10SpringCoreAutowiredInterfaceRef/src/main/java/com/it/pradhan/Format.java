package com.it.pradhan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Format {
	@Autowired
	private IProcess pob;
	
	public void printFormat() {
		pob.getProcesCode();
		System.out.println("FROM FORMAT"); 
	}

}
