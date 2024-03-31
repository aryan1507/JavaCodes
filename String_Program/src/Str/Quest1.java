package Str;
public class Quest1{

	public static void main(String[] args) {
		//Scanner input=new Scanner(System.in);
	    String s="ssuccessree";
	    char[] a=s.toCharArray();
	    int i=0;
	    String x="";
	    while(i<a.length) {
	    	int count=1;
	    	char b=a[i];
	    	i++;
	    	while(i<=a.length-1 && a[i]==b) {
	    		count++;
	    	    i++;
	    	}
	    	if(count>1) {
	    		x+=count+""+b;
	    	}
	    	else{x+=b;}
	    }
	    System.out.println(x);

	}

}
