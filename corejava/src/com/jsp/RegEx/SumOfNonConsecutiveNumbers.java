package com.jsp.RegEx;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class SumOfNonConsecutiveNumbers {

	public static void main(String[] args) {
		String s = "[0-9]+";
		String k = "sd1n34k55";
		Pattern p = Pattern.compile(s);
		Matcher m = p.matcher(k);
		
		int sum=0;
		while(m.find()) {
			sum+=Integer.parseInt(m.group());
		}
		System.out.println(sum);
	}

}
