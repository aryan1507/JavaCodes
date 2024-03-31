package com.Regular_Expression;
 

import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Quest6 {

	public static void main(String[] args) {
	    Pattern p=Pattern.compile("([a-z])\\1*");
	    Matcher m=p.matcher("aabbbaaacccde");
	    
	    while(m.find()) {
	    	//System.out.println(m.start());
	    	//System.out.println(m.end());
	    	System.out.println(m.group());
	    	System.out.println("-----------");
	    }

}
}