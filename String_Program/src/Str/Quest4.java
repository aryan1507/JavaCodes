package Str;
import java.util.Scanner;
public class Quest4 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the String: ");
		String s3=input.nextLine();
	    char[] arr=s3.toCharArray();
		String s4="";
		String s5="";
		
		for(char c:arr) {
			if(c!=' ') {
				s4=c+s4;
			}
			else {
				s5+=s4+" ";
				s4="";
			}
		
		}
		s5+=s4+"";
		//System.out.println(s3.length());
		System.out.println(s5);
		//System.out.println(s5.length());

	}

}
