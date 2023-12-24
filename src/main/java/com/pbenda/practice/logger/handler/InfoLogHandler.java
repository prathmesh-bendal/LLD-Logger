package com.pbenda.practice.logger.handler;

import com.pbenda.practice.logger.levels.LogLevel;

public class InfoLogHandler extends LogHandler {

	public InfoLogHandler(LogHandler nextLogHandler) {
		super(nextLogHandler);
	}
	
	public void log(LogLevel level,String msg)
	{
		if(level.equals(LogLevel.INFO))
		{
			super.getSink().flush("INFO:"+msg);
		}
		else
		{
			super.log(level, msg);
		}
	}

}
