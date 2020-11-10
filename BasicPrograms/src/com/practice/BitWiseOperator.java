/*
 * Bitwise Operators:
 * <<:bitwise leftshift (multiply by 2^n)
 * >>:bitwise rightshift (divide by 2^n)
 * &:bitwise AND
 * |:bitwise - OR
 * ^: bitwise - XOR
 * ~:bitwise -Not
 * 
 * eg: 32 bits (left shift)
 *  a=1  = 00000000 00000000 00000000 00000010 a<<4
 * result= 00000000 00000000 00000000 00100000  
 */ 

package com.practice;

public class BitWiseOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=1,b=4;
		a=a<<4;
		b=b>>>1;
		int c=2|3;
				System.out.println("LeftShift: "+a+"\n"+"RightShift: "+b+"\n"+"XOR :"+c);
				
	}
}