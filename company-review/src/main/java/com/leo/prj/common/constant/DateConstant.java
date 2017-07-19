package com.leo.prj.common.constant;

import java.time.LocalDate;
import java.time.LocalDateTime;

public interface DateConstant {
	public static final LocalDateTime DEFAULT_LOCAL_DATE_TIME = LocalDateTime.of(1900, 1, 1, 0, 0, 0, 0);
	public static final LocalDate DEFAULT_LOCAL_DATE = LocalDate.of(1900, 1, 1);
	public static final String DATE_FORMAT_PATTERN = "dd-MM-yyyy";
	public static final String TIME_FORMAT_PATTERN = "HH:mm:ss:SSS";
	public static final String DATETIME_FORMAT_PATTERN = "dd-MM-yyyy HH:mm:ss.SSS";
}
