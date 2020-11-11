package com.practice;
import java.util.*;

public class PowerOfANumber 
{
	public static void main(String[] args) {
    
		Scanner sc=new Scanner(System.in); 
		
        System.out.println("Enter the value of a base: ");
        
        int base=sc.nextInt();
       
        System.out.println("Enter the value of exponent: ");
        
        int exp=sc.nextInt();
       
        int result=1;
        
        while(exp!=0)
        {
        	result=result*base;
        	--exp;
        }
        System.out.println("Answer= "+result);
        sc.close();
	}
}