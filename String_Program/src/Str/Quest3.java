package Str;

public class Quest3{
	public static void main(String[] args) {
		String s1="Java is very Easy";
		char[] arr=s1.toCharArray();
		String s2="";
		String s3="";
		
		for(char c:arr) {
			if(c!=' ') {
				s2+=c;
			}
			else {
				s3=s2+" "+s3;
				s2="";
			}
		
		}
		s3=s2+" "+s3;
		System.out.println(s3);
		
	}
}