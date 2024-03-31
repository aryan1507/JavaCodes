package com.jsp.RegEx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CountVowelsWithChar {

	public static void main(String[] args) {
		Pattern p = Pattern.compile("[aeiou]");
		Matcher m = p.matcher("asegyrvunad");
		
		while(m.find()) {
			int count = 0;
			System.out.println(m.group() + "-" + (++count));
		}
	}

}
