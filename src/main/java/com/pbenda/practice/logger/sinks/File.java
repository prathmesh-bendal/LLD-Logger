package com.pbenda.practice.logger.sinks;

public class File implements Sink {

	@Override
	public void flush(String msg) {
		
		System.out.println("FILE ###"+msg);
		
	}

}
