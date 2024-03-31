package Str;
import java.util.Scanner;
public class Quest10 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the String: ");
		String str=input.nextLine();
		char[] a=str.toCharArray();
		int level=6;
		char[] alpha="abcdefghijklmnopqrstuvwxyz".toCharArray();
		//level=level%26;
		String s2="";
		for(char c:a) {
			int index=c-'a';
			index+=level;
			s2+=alpha[index%26];
		}
         System.out.println(s2);
	}

}
