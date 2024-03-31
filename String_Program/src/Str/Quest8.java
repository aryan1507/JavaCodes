package Str;

public class Quest8 {

	public static void main(String[] args) {
		String s1="abcdzyu";
		char[] arr=s1.toCharArray();
		int i=97;
		String s2="";
		while(i>=97 && i<=122) {
			char s=(char)i;
			boolean b=false;
			for(int j=0;j<arr.length;j++) {
				if(arr[j]==s) {
				  b=true;
				  break;
				}
			}
			if(b==false) {	
				s2+=s+" ";
			}
			i++;
		}
		System.out.println(s2);

	}

}
