package Str;

public class Quest7 {

	public static void main(String[] args) {
	  String s1="Java is easy";
	  String[] arr=s1.split(" ");
	  String s2="";
	  for(int i=0;i<arr.length;i++) {
		   s2+=rev(arr[i]);
		   if(i<arr.length-1) s2+=" ";
		   
	  }
	  System.out.println(s2);
     
	}
	static String rev(String s) {
		char[] a=s.toCharArray();
		int i=0,j=a.length-1;
		while(i<j) {
			char temp=a[i];
			a[i]=a[j];
			a[j]=temp;
			i++;
			j--;
		}
		return new String(a);
	}

}
