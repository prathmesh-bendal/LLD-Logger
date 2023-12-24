package com.pbenda.practice.logger.handler;

import com.pbenda.practice.logger.levels.LogLevel;
import com.pbenda.practice.logger.sinks.Sink;

public abstract class LogHandler {
	
	private LogHandler nextLogHandler;
	private static Sink sink;

	public LogHandler(LogHandler nextLogHandler) {
		super();
		this.nextLogHandler = nextLogHandler;
	}
	
	
	
	public Sink getSink() {
		return sink;
	}



	public void setSink(Sink sink) {
		this.sink = sink;
	}



	public void log(LogLevel level,String msg)
	{
		if(nextLogHandler!=null)
		{
			nextLogHandler.log(level, msg);
		}
	}
	

}
