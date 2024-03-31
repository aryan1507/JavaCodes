package com.jsp.array;

import java.util.Arrays;

public class SumOfEle {

	public static void main(String[] args) {
		int[] a = {1,2,3,4,5};
		int[] b = {1,2,3};
		int size = (a.length > b.length)?a.length:b.length;
		int[] res = new int[size];
		int i=0,j=0,k=0;
		while(i<b.length && j<a.length) {
			res[k++] = b[i++] + a[j++];
		}
		while(j<a.length) {
			res[k++] = a[j++];
		}
		while(i<b.length) {
			res[k++] = b[i++];
		}
		System.out.println(Arrays.toString(res));
	}

}
