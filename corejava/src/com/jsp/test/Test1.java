package com.jsp.test;

import java.util.Arrays;
import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		/*input = "{1,2,3}
		 * output = {1,2,4}"
		 * input = "{9,9,9}
		 * output = {1,0,0,0}"*/
		
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter size of the input array: ");
		int size = scn.nextInt();
		int[] input = new int[size];
		
		System.out.print("Enter the elements of the array: ");
		for(int i=0;i<input.length;i++) {
			input[i] = scn.nextInt();
		}		
		String s="";
		for(int i=0;i<input.length;i++) {
			s+=input[i];
		}
		int num = Integer.parseInt(s);
		int sum = num+1;
		int n = sum;
		int count=0;
		while(n>0) {
			count++;
			n/=10;
		}
		n=sum;
		int[] output = new int[count];
		int j=count-1;
		while(n>0) {
			output[j] = n%10;
			n/=10;
			j--;
		}
		System.out.println(Arrays.toString(output));
	}

}
