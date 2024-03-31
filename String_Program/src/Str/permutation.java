package Str;

public class permutation {

	public static void main(String[] args) {
		display("abc",0,2);

	}
    static void display(String s,int start,int end) {
    	if(start==end) {
    		System.out.println(s);
    		return;
    	}
    	for(int i=start;i<=end;i++) {
    		String s1=swap(s,start,i);
    		display(s1,start+1,end);
    	}
    }
    static String swap(String s,int i,int j) {
    	char[] a=s.toCharArray();
    	char t=a[i];
    	a[i]=a[j];
    	a[j]=t;
    	return new String(a);
}

}
