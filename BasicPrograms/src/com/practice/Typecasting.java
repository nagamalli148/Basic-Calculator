// byte<short<int<long<float<double
//widening (Implicit typecasting)
//Narrowing 

package com.practice;
class SuperClass {
	
}
public class Typecasting extends SuperClass {

	public static void main(String[] args) {
        int a=3;
        double b=3.14;
        
        a=(int)b; //Explicit Typecasting - converting into int
        
        // Widening implicit typecast aligning smaller element to bigger element
         
        System.out.println(a);
        
   //We cannot extend superclass to typecast but we can do in viceversa
       
       SuperClass s=new SuperClass();
       Typecasting x=new Typecasting();
       
       x=(Typecasting)s;		
	}

}
