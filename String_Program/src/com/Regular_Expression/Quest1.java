package com.Regular_Expression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Quest1 {

	public static void main(String[] args) {
		Pattern p=Pattern.compile("ab");
		Matcher m=p.matcher("abcdabcdabj");
		System.out.println(m.find());
		System.out.println(m.find());
		System.out.println(m.find());
		System.out.println(m.find());

	}

}
