package com.pbenda.practice.logger.handler;

import com.pbenda.practice.logger.levels.LogLevel;

public class DebugLogHandler extends LogHandler{

	public DebugLogHandler(LogHandler nextLogHandler) {
		super(nextLogHandler);
	
	}
	
	public void log(LogLevel level,String msg)
	{
		if(level.equals(LogLevel.DEBUG))
		{
			super.getSink().flush("DEBUG:"+msg);
		}
		else
		{
			super.log(level, msg);
		}
	}

}
