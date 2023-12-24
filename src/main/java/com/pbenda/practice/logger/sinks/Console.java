package com.pbenda.practice.logger.sinks;

public class Console implements Sink{

	@Override
	public void flush(String msg) {
		
		System.out.println("CONSOLE ###"+msg);
		
	}

}
