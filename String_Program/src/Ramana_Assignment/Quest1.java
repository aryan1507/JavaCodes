package Ramana_Assignment;
import java.util.Scanner;
public class Quest1 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the String:");
		String s1=input.next();
		String s2="";
		char[] arr=s1.toCharArray();
		int i=0;
		while(i<arr.length){
			boolean flag=true;
			if(s2==null) {
				s2+=arr[i];
				i++;
			}
			int j=0;
			while(j<s2.length()) {
				if(s2.charAt(j)==arr[i]) {
					flag=false;
					break;
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
