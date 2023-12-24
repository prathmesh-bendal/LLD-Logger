package com.pbenda.practice.logger.handler;

import com.pbenda.practice.logger.levels.LogLevel;

public class ErrorLogHandler extends LogHandler{

	public ErrorLogHandler(LogHandler nextLogHandler) {
		super(nextLogHandler);
	}
	
	public void log(LogLevel level,String msg)
	{
		if(level.equals(LogLevel.ERROR))
		{
			super.getSink().flush("ERROR:"+msg);
		}
		else
		{
			super.log(level, msg);
		}
	}

}
