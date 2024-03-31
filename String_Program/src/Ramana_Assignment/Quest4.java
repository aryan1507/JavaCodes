package Ramana_Assignment;

public class Quest4 {

	public static void main(String[] args) {
		String s="Hello WorldWHHH";
		char ch[]=s.toCharArray();
		for(int i=0;i<ch.length;i++) {
			int count=50;
			for(int j=i+1;j<ch.length;j++) {
				if((ch[i]>='a' && ch[i]<='z') || (ch[i]>='A' && ch[i]<='Z')) {
					if(ch[i]==ch[j]) {
						ch[j]=(char)count;
						count++;
					}
				}
			}
			if(count !=50) {
				ch[i]='1';
			}
			
		}
		System.out.println(ch);
	}

}
