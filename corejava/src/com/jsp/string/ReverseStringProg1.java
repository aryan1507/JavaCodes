package com.jsp.string;

public class ReverseStringProg1 {

	public static void main(String[] args) {
		String s = "java";
		System.out.println(isReverse(s));
	}
	public static String isReverse(String s) {
		if(s.length() == 0)
			return "";
		return s.charAt(s.length()-1) + isReverse(s.substring(0,s.length()-1));
	}

}
