package com.pbenda.practice.logger.sinks;

public class DB implements Sink{

	@Override
	public void flush(String msg) {
		System.out.println("DB ###"+msg);
		
	}

}
