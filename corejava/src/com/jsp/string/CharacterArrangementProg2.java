package com.jsp.string;

public class CharacterArrangementProg2 {

	public static void main(String[] args) {
		String s = "ram#123";
		String res = "";
		int i=0;
		while(i<s.length()) {
			if(s.charAt(i) == '#') {
				break;
			}
			i++;
		}
		for(int j=i+1;j<s.length();j++) {
			res += s.charAt(j);
		}
		res += s.charAt(i);
		for(int j=0;j<i;j++) {
			res += s.charAt(j);
		}
		System.out.println(res);
	}

}
