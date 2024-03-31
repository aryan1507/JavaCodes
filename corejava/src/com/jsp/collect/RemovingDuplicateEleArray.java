package com.jsp.collect;

import java.util.LinkedHashSet;

public class RemovingDuplicateEleArray {

	public static void main(String[] args) {
		LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();
		int[] a = {1,2,3,4,6,3,4};
		for(int i=0;i<a.length;i++) {
			set.add(a[i]);
		}
		System.out.println(set);
	}

}
