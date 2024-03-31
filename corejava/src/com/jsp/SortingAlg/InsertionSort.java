package com.jsp.SortingAlg;

public class InsertionSort {

	public static void main(String[] args) {
		int[] arr= {3,1,2,12,6,1,7};
		sort(arr);
		for(int n:arr) {
			System.out.print(n+" ");
		}

	}
	public static void sort(int[] a) {
		for(int i=1;i<a.length;i++) {
			int key=a[i];
			int j=i-1;
			while(j>=0 && a[j]> key) {
				a[j+1]=a[j];
				j--;
			}
			a[j+1]=key;
		}
	}

}
