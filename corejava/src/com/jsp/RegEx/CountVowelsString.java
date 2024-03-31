package com.jsp.RegEx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CountVowelsString {

	public static void main(String[] args) {
		Pattern p = Pattern.compile("[aeiou]");
		Matcher m = p.matcher("asegyrvunad");
		int count = 0;
		while(m.find()) {
			count++;
		}
		System.out.println(count);
	}

}
