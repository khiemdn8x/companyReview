package com.leo.prj.common.utils;

public enum StringUtils {
	INSTANCE;

	public boolean isEmpty(final String s) {
		return (s == null) || s.isEmpty();
	}

	public boolean isBlank(final String s) {
		return (s == null) || s.trim().isEmpty();
	}
}
