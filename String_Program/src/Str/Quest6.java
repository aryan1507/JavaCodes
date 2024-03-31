package Str;

import java.util.Scanner;
public class Quest6 {

	public static void main(String[] args) {
				Scanner input=new Scanner(System.in);
				System.out.println("Enter a String: ");
				String s1=input.nextLine();
						char[] arr=s1.toCharArray();
						String s2="";
						String s3="";
						int cnt=0;
						int z=0;
						for(char c:arr) {
							z++;
							if(c==' ') {
									cnt++;
								}
							else {
						
								if(z==arr.length-1) {
									cnt++;
								}
							}
								
							}
						
						System.out.println(cnt);
						
					
				
}
			

	}
	

