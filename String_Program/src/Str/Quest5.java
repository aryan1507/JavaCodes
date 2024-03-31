package Str;

import java.util.Scanner;
public class Quest5 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter a String: ");
		String s1=input.nextLine();
				char[] arr=s1.toCharArray();
				String s2="";
				String s3="";
				
				for(char c:arr) {
					if(c!=' ') {
						if(s2=="") {
							s2+=(c+"").toUpperCase();
						}
						else{
							s2+=c;
						}
					}
					else {
						s3=s3+" "+s2;
						s2="";
					}
				
				}
				s3=s3+" "+s2;
				System.out.println(s3);
				
			}
		

	}


