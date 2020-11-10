//Case1:Proper String
//Case2:First word may have spaces at start
//Case3:Any word can have many spaces at start & end

package com.strings;

public class PrintFirstCharacterOfEveryWord {
public static void main(String[] args) {
	
	String s="Hello Naga Malli";
	char a[]=s.toCharArray();
	for(int i=0;i<a.length;i++)  
	{
		if(a[i]!=' ')      //h(i)==0,a[i]=0   
		
		{
			if(i==0) 
			{
				System.out.println(a[i]);
			}
			else if(a[i-1]==' ')
			{
				System.out.println(a[i]); 
			}
		}
	}
}
}

/*
   
   char a[] = s.toCharArray();
   for(int i = 0; i < a.length; i++) {
   if(a[i] != ' ' && (i == 0 || a[i - 1] == ' ')) {
        System.out.println(a[i]);
  
  */
