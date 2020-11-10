package com.practice;

public class JaggedArray {

	public static void main(String[] args) {
        /*  
         * 2D Jagged Array
		int a[][];
		a=new int[3][];
		a[0]=new int[4];
		a[1]=new int[2];
		a[2]=new int[3];
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {  //Number of elements in that row=a[i].length
				a[i][j]=i+j;
		System.out.print("Array is:"+a[i][j]+" ");
			}
			System.out.println();
		}
		*/
		
		//3D jaggged Array
		int a[][][]=new int[2][][];
		a[0]=new int[3][];
		a[1]=new int[2][];
		
		a[0][0]=new int[4];  //1st row
		a[0][1]=new int[3];
		a[0][2]=new int[2];
		
		
	}

}
