package org.bjgarc;

public class StringReverse {

	public static void main(String[] args) {
		/*
		StringReverse sr = new StringReverse();
		String response = sr.firstReverse("coderbyte");
		System.out.println(response);
		*/
		
		System.out.println(firstReverseManual("coderbyte"));
		//System.out.println(sr.firstFactorial());
	}
	
	public String firstReverse(String str) {
		StringBuffer buff = new StringBuffer(str);
		buff.reverse();
		return buff.toString();
	}
	
	public static String firstReverseManual(String str) {
		char[] chars = str.toCharArray();
		StringBuilder buff = new StringBuilder();
		int i = chars.length - 1;
		while (i >= 0) {
			System.out.println(chars[i]);
			buff.append(chars[i]);
			i--;
		}
		return buff.toString();
	}
	
	public int firstFactorial() {
		int num = 8;
	    int tmp = 1;
	    
	    while (1 <= num) {
	    	    	
	    	tmp = tmp * num;
	    	num--;
	    }
	    return tmp;
	}

}
