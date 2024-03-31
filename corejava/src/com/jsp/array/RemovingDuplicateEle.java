package com.jsp.array;

import java.util.Arrays;

public class RemovingDuplicateEle {

	public static void main(String[] args) {
		int[] a = {1,6,4,3,2,4,3}; 
		Arrays.sort(a); //1,2,3,3,4,4,6
		for(int i=1;i<a.length;i++) {
			if(a[i] == a[i-1]) {
				a[i-1] = 0;
			}
		}
		if(a[a.length-1] == a[a.length-2]) {
			a[a.length-2] = 0;
		}
//		System.out.println(Arrays.toString(a));
		int[] b = new int[a.length];
		int j=0;
		for(int i=0;i<a.length;i++) {
				if(a[i] != 0) {
					b[j] = a[i];
					j++;
				}
		}
//		System.out.println(Arrays.toString(b));
		int[] c = new int[j];
		for(int i=0;i<j;i++) {
			c[i] = b[i];
		}
		System.out.println(Arrays.toString(c));
	}

}
