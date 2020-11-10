package com.practice;
public class SwitchStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=3; //int,short,byte,char are allowed
		
		final int b=2; //we can use b in case (eg:case b:)
		switch(a) {
		case 1:
			System.out.println("a is 1");
			break; 
		//If it matches a value it will break the program and exit, If we won't write break it will execute default case also.
		
		case 2:
			System.out.println("a is 2");
			break;
		
		case 3:
			System.out.println("a is 3");
			break;
		default:
			System.out.println("a is some other value");
			break;
		}
		
	}
}