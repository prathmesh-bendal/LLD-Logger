package com.pbenda.practice.logger;

import com.pbenda.practice.logger.handler.DebugLogHandler;
import com.pbenda.practice.logger.handler.ErrorLogHandler;
import com.pbenda.practice.logger.handler.InfoLogHandler;
import com.pbenda.practice.logger.handler.LogHandler;
import com.pbenda.practice.logger.sinks.Sink;

public class Logger {
	
	private static LogHandler logger=new DebugLogHandler(new InfoLogHandler(new ErrorLogHandler(null)));
	
	private Logger()
	{
		
	}
	
	public static LogHandler getLogger(Sink sink)
	{
		logger.setSink(sink);
		return logger;
	}
	
	public static LogHandler changeSink(Sink sink)
	{
		logger.setSink(sink);
		return logger;
	}
	
	

}
