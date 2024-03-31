package Ramana_Assignment;

import java .util.Scanner;
public class Quest5 {

	public static void main(String[] args) {
		System.out.println("Enter a stirng:");
		Scanner sc = new Scanner(System.in);
		String s1= sc.nextLine();
		char[] arr =s1.toCharArray();
		for(int i=0;i<arr.length;i++)
		{
			int count=50;
			for(int j=i+1;j<arr.length;j++)
			{
				if((arr[i]>'a' && arr[i]<'z') || (arr[i]>'A' && arr[i]<'Z')) {
					if(arr[i]== arr[j]){
						arr[j]=(char) count;
						count++;
					}
				}
			}
			if(count!=50) arr[i]='1';
		}
		System.out.println(arr);
	}

}
