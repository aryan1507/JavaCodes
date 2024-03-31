package com.jsp.string;

public class CountWordsInString {

	public static void main(String[] args) {
		String s = "java is easy  as";
//		String[] a = s.split(" ");
//		System.out.println(a.length);
		int count = 0;
		int i=0;
		while(i<s.length()) {
			if(s.charAt(i) == ' ') {
				if(s.charAt(i+1) == ' ') {
					continue;
				}
				count++;
			}
			i++;
		}
		System.out.println(count+1);
	}

}
