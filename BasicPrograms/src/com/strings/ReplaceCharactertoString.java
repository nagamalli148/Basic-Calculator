package com.strings;

public class ReplaceCharactertoString {
public static void main(String[] args)
{
	String s="Hello World!! welcome to placement channel";
	
	char ch[]=s.toCharArray(); //char Array
	
	for(int i=0;i<ch.length;i++) {
		if(ch[i]=='o') {
			
			ch[i]='N';
		}
	}
			System.out.println(ch);
}
}
