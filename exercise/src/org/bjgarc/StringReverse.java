package org.bjgarc;

public class StringReverse {
	
	public static String firstReverse(String str) {
		StringBuffer buff = new StringBuffer(str);
		buff.reverse();
		return buff.toString();
	}
	
	public static String firstReverseManual(String str) {
		char[] chars = str.toCharArray();
		StringBuilder buff = new StringBuilder();
		int i = chars.length - 1;
		while (i >= 0) {
			buff.append(chars[i]);
			i--;
		}
		return buff.toString();
	}

}
