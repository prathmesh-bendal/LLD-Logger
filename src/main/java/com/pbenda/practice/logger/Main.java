package com.pbenda.practice.logger;

import com.pbenda.practice.logger.handler.LogHandler;
import com.pbenda.practice.logger.levels.LogLevel;
import com.pbenda.practice.logger.sinks.Console;
import com.pbenda.practice.logger.sinks.File;
import com.pbenda.practice.logger.sinks.Sink;

public class Main {

	public static void main(String[] args) {
		
		Sink sink=new Console();
		LogHandler logger=Logger.getLogger(sink);
		
		logger.log(LogLevel.DEBUG, "i am debug");
		logger.log(LogLevel.INFO, "i am info");
		logger.log(LogLevel.ERROR, "i am error");
		sink=new File();
		logger=Logger.changeSink(sink);
		
		logger.log(LogLevel.DEBUG, "i am debug");
		logger.log(LogLevel.INFO, "i am info");
		logger.log(LogLevel.ERROR, "i am error");

	}

}
