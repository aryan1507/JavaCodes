package com.jsp.string;

public class NumberToString {
	public static void main(String[] args) {
		int n=98765321;
		pw(n/10000000,"crore");
		pw((n/100000)%100,"lakhs");
		pw((n/1000)%100,"thousand");
		pw((n/100)%10,"hundred");
		pw(n%100," ");

	}
  public static void pw(int n,String s) {
	  String[] one= {"","one","two","three","four","five","six","seven","eight","nine","ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
	  String[] two= {"","","tewnty","thirty","forty","fifty","sixty","seventy","eighty","ninety"};
	  if(n<=19) {
		  s=one[n]+" "+s;
	  }
	  else {
		  s=two[n/10]+one[n%10]+" "+s;
	  }
	  if(n!=0) {
		  System.out.print(s+" ");
	  }
  }
}
