package com.Regular_Expression;
 

import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Quest3 {

	public static void main(String[] args) {
	    //Pattern p=Pattern.compile("[abc]");
		//Pattern p=Pattern.compile("a[abc]");
		//Pattern p=Pattern.compile("[a-r]");
		//Pattern p=Pattern.compile("[0-9]");
		//Pattern p=Pattern.compile("[a-z012]");
		Pattern p=Pattern.compile("a[^0-9]");
	    Matcher m=p.matcher("abcbs01a2sa6bnabmf0a1amn89ocna3rjna5bd");
	    
	    while(m.find()) {
	    	//System.out.println(m.start());
	    	//System.out.println(m.end());
	    	System.out.println(m.group());
	    	System.out.println("-----------");
	    }

}
}
