package com.strings;

public class StringClass {

	public static void main(String[] args) {
		
		/*String s="java";
		 String st=new String("C++");
		//String is a immutable object
		s="C++";
		s=s+" "+"ruby";
		//String array
		String a[]=new String[3];
		a[0]="Google";
		a[1]="FaceBook";
		a[2]="Amazon";
		for(String s:a) 
	*/
		/*
		String s="HelloWorld";
		int n;
		n=s.length();
		//String boolean
		boolean b=s.startsWith("Hello"); //checks the condition
		boolean c=s.endsWith("d"); 
		System.out.println(b);
		System.out.println(c);
        System.out.println(s+" "+n);
         
        //Trim 
        String s1=" NagaMalli ";
        s1=s1.trim();  //Remove the spaces
        System.out.println(s1);
         
        //String character
        char ch;
        ch=s1.charAt(1); //character at first point
        System.out.println(ch);
        
       //Substring concept
        
        String s2="HelloWorld";
        String s3,s4;
        s3=s.substring(3);
        s4=s.substring(5,8);
        System.out.println(s3+" "+s4);
        
        //String comparison
        String x="hello";
        String y="hello";
        String p=new String("hello"); //string object
        boolean z=(x==y);
        boolean z1=(x==p);
        System.out.println("Given String is:"+z1); //output would be false because when u are creating the new object,refrence variables is not equal
        boolean p1=(x.equals(p)); //comparing the strings using function or method equals
        System.out.println("Equals Method Matched,So"+ p1);
        System.out.println("Both references are equal: "+ z); //both value references are same gives true   
	    
        int i;
        i=x.compareTo(y); //returns either 0 or 1
        System.out.println(i);
        
        String m1="abcd";
        String m2="aecd"; //Asci value diff will be printed b,c,d,e =-3
        int i1;
        i1=m1.compareTo(m2);
        System.out.println(i1);
        int i2=m1.indexOf("cd");//
        int l=m1.lastIndexOf("a",3);
        System.out.println(l);
        System.out.println(i2);
        m1=m1.toUpperCase(); //To convert it into uppercase
        System.out.println(m1);
        
        //character Array
        char g[];
        
        String s5="Naga Malli";
        g=s5.toCharArray(); //converts into array
        
        for(char c1:g) {
        System.out.print(c1+" ");
     */ 
  
    String s="Hello World";
    char c[]=new char[7]; // 7 element array
    
    //s.getChars(2, 5,c, 0); //starting index,end index,destination c array,destination begins at 0
    //for(char ch:c) {
    //System.out.println(ch);   
    
    char c1[]= {'h','e','l','l','o'};
    String s1=String.copyValueOf(c1);
    System.out.println(s1);
    }
}


/*Why string is immutable , 

*/