package Ramana_Assignment;

import java.util.Scanner;
public class Quest2 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the String:");
		String s1=input.next();
		String s2="";
		char[] arr=s1.toCharArray();
		int i=0;
		while(i<arr.length){
			boolean flag=true;
			int j=0;
			while(j<arr.length) {
				if(i==j) {}
				else{
					if(arr[i]==arr[j]) {
					flag=false;
					break;
				}
				
			}
				j++;
			}
			if(flag==true){ 
				s2+=arr[i];
				}
			i++;
		}
         System.out.println(s2);
	}

	}


