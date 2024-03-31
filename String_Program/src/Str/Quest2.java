package Str;

public class Quest2 {

	public static void main(String[] args) {
		String s1="ABhISeK";
		String B="";
		for(int i=0;i<s1.length();i++) {
			char ch=s1.charAt(i);
			if(ch>='A' && ch<='Z') {
				B+=(ch+"").toLowerCase();	
			}
			else {
				B+=(ch+"").toUpperCase();
			}
		}
		System.out.println(B);

	}

}
