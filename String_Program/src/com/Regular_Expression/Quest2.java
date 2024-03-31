package com.Regular_Expression;
 

import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Quest2 {

	public static void main(String[] args) {
	    Pattern p=Pattern.compile("ab");
	    Matcher m=p.matcher("abcbssabnabmfnjnabd");
	    
	    while(m.find()) {
	    	System.out.println(m.start());
	    	System.out.println(m.end());
	    	System.out.println(m.group());
	    	System.out.println("-----------");
	    }

}
}