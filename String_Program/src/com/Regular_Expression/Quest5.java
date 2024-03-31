package com.Regular_Expression;

public class Quest5 {

	public static void main(String[] args) {
		String s1="Hello World";
		String s2="";
		char[] arr=s1.toCharArray();
		int i=0;
		while(i<arr.length) {
			int j=0,cnt=0;
			boolean flag=true;
			while(j<arr.length) {
					if(arr[i]==arr[j]) {
						if(i==j && flag==true) {}
						else{
							if(i>j ||i==j ){
							flag=false;
							cnt++;
						}
					}
					}
				j++;
			}
			if(flag) {
				s2+=arr[i];
			}
			else {
				s2+=cnt;
			}
			i++;
		}
		System.out.println(s2);

	}

}
