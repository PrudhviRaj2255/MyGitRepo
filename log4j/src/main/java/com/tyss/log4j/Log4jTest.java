package com.tyss.log4j;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.xml.XMLLayout;

public class Log4jTest {

	public static void main(String[] args) {
		
		
		BasicConfigurator.configure();
		
		
		Logger logger = Logger.getLogger(Log4jTest.class);
		
//		ConsoleAppender appender = new ConsoleAppender();
//		appender.setLayout(new XMLLayout());
//		logger.addAppender(appender);
		
		logger.setLevel(Level.ALL);
		
		logger.trace("trace started");
		logger.fatal("fatal msg");
		logger.error("error msg");
		logger.warn("warn msg");
		logger.info("info msg");
		logger.debug("debug msg");
		logger.trace("trace ended");
		
	}
	
}
