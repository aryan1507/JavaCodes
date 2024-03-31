package Str;
import java.util.Scanner;
public class Quest9 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String: ");
		String s1=sc.nextLine();
		char[] arr=s1.toCharArray();
		int cnt=0;
		int i=0;
		boolean b=true;
		while(i<arr.length ) {
			char a=arr[i];
			if(arr[i]==' ' && b==true) {
				i++;
				while(i<arr.length && arr[i]==a) {
					i++;
				}
			}
			else {
			b=false;
			if(arr[i]==' ' && b==false) {
	           char a1=arr[i];
	           i++;
	           while(i<arr.length && arr[i]==a1) {
					i++;
				}
               cnt++;
			}
			else {
			if(i==arr.length-1) {
				cnt++;
			}
			}
			i++;
		
			}

	}
		System.out.println(cnt);

	}
}
