package day8interface;

import java.util.StringTokenizer;

public class Tokenizer {
	
	int count =0;
	
	public static void main(String[] args) {
		int count =0;
	String quotes = ("Honesty is the best policyu and is a good policy and is healthy");
	StringTokenizer tok=new StringTokenizer(quotes);
	
	System.out.println("number of word: "+ tok.countTokens());
	
	while (tok.hasMoreTokens())
	{
	
	String temp = tok.nextToken();
	if (temp.equals("and"))
		count ++;
}
	System.out.println("Count of \" and\" in the string:" + count);
	}
}