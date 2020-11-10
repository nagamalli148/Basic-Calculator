package com.practice;

public class MultiDimensionalArray {

	public static void main(String[] args) {
		int a[][]=new int[3][4];
		
		for(int i=0;i<a.length;i++) { //rows
			
			for(int j=0;j<a[i].length;j++)
			
		 {
				 
				a[i][j]=i+j;
				System.out.print(a[i][j] +" ");
	     }
		   System.out.println();
		}
	}
}
