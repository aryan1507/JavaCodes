package Ramana_Assignment;

public class Quest6 {

	public static void main(String[] args) {
	  display("abcd");

	}
	public static void display(String s) {
		
		for(int i=0;i<=3;i++) {
			String s1=swap(s,0,i);
			//System.out.println(s1);
		}
		for(int j=1;j<=3;j++) {
			String s1=swap(s,1,j);
			//System.out.println(s1);
		}
		for(int k=2;k<=3;k++) {
			String s1=swap(s,2,k);
			System.out.println(s1);
		}
		
	}
	public static String swap(String s,int i,int j) {
		char[]a=s.toCharArray();
		char t=a[i];
		a[i]=a[j];
		a[j]=t;
		return new String(a);
	}

}
