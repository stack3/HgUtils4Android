package net.stack3.hglib.utils;

import java.util.ArrayList;

public class StringUtils {
	public static String clipWithSuffix(String str, int maxLength, String suffix) {
		int realMaxLen = maxLength - suffix.length();
		if (realMaxLen < 0) {
			realMaxLen = 0;
		}
		if (str.length() <= realMaxLen) {
			return str;
		}
		
		return str.substring(0, realMaxLen) + suffix;
	}
	
	public static String join(ArrayList<String> ary, String seperator) {
		StringBuilder result = new StringBuilder();
		for (int i = 0; i < ary.size() - 1; i++) {
			result.append(ary.get(i));
			result.append(seperator);
		}
		result.append(ary.get(ary.size() - 1));
		
		return result.toString();
	}
}
