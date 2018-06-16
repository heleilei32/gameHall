package com.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DCLog {
	// //////////////////////////////////////////////////
	private final static Logger log4j = LoggerFactory.getLogger(DCLog.class);

	/**
	 * 日志
	 * 
	 * @param flag
	 *            标志
	 * @param value
	 *            具体的值
	 */
	public static final void log(String flag, String value) {
		log4jLog(flag, value);
	}

	/**
	 * 打印异常
	 * 
	 * @date 2017-4-18 下午3:04:56
	 * @author cao_xue_yong
	 * @param message
	 * @param throwable
	 */
	public static final void logException(String message, Throwable throwable) {
		log4jLogException(message, throwable);
	}

	/**
	 * 得到类名
	 * 
	 * @return
	 */
	private static final String getClassName() {
		StackTraceElement[] list = Thread.currentThread().getStackTrace();
		if (list == null || list.length == 0) {
			return "noClass";
		}
		if (list.length > 4) {
			return list[4].getClassName();
		}
		return list[list.length - 1].getClassName();
	}

	/**
	 * 得到方法名
	 * 
	 * @return
	 */
	private static final String getMethodName() {
		StackTraceElement[] list = Thread.currentThread().getStackTrace();
		if (list == null || list.length == 0) {
			return "noMethod";
		}
		if (list.length > 4) {
			return list[4].getMethodName();
		}
		return list[list.length - 1].getMethodName();
	}

	// //////////////////////////////////////////////////////////////////

	/**
	 * log4j的日志
	 * 
	 * @date 2017-4-13 下午1:05:47
	 * @author cao_xue_yong
	 * @param flag
	 *            标志
	 * @param value
	 *            具体的值
	 */
	private static final void log4jLog(String flag, String value) {
		// 当前使用的类名
		String className = getClassName();
		// 当前调用我的方法名
		String methodName = getMethodName();
		// 打印的格式
		log4j.info("(" + className + ") (" + methodName + ") (" + flag + "__" + value + ")");
	}

	/**
	 * log4j的日志打印异常
	 *
	 * @date 2017-4-18 下午3:08:44
	 * @author cao_xue_yong
	 * @param message
	 * @param throwable
	 */
	private static final void log4jLogException(String message, Throwable throwable) {
		String className = getClassName();
		String methodName = getMethodName();
		// 添加当前的异常数量
		//SysRunTime.addCurExceptionCount();
		// 打印的格式
		log4j.error("(" + className + ") (" + methodName + ") (" + message + "__异常信息)", throwable);
	}

}
