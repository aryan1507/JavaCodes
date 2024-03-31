package com.jsp.collect;

import java.util.LinkedHashMap;
import java.util.Map;

public class intToRoman {

	public static void main(String[] args) {
		Map<Integer,String> mp = new LinkedHashMap<Integer,String>();
		mp.put(1000, "M");
		mp.put(900, "CM");
		mp.put(600, "DC");
		mp.put(500, "D");
		mp.put(400, "CD");
		mp.put(100, "C");
		mp.put(90, "XC");
		mp.put(60, "LX");
		mp.put(50, "L");
		mp.put(40, "XL");
		mp.put(10, "X");
		mp.put(9, "IX");
		mp.put(6, "VI");
		mp.put(5, "V");	
		mp.put(4, "IV");
		mp.put(1, "I");
		
		int num = 358;
		String s = "";
		int[] key = {1000,900,600,500,400,100,90,60,50,40,10,9,6,5,4,1};
		for(int n:key) {
			while(num>=n) {
				s += mp.get(n);
				num -= n;
			}
		}
		System.out.println(s);
	}

}
