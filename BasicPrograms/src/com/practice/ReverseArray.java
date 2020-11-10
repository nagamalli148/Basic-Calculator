package com.practice;

public class ReverseArray 
{
		private int[] reverseArray1(int[] arr,int n) {
			if(arr.length<=1) {
			return arr;
		}
		
		int[] new_array=new int[n];  //new_array={0,0,0,0,0}
		int j=n; //j=5
		
		for(int i=0;i<n;i++) {
			new_array[j-i-1]=arr[i];
		}
		return new_array;
	}
	//Second method
	private void ReverseArray(int arr[],int n) {
		
		if(arr.length<=1) {
			return;
		}
		
	}
	public static void main(String[] args) {
	  ReverseArray reverse=new ReverseArray();
	  
	  int arr[]= {1,2,3,4,5};
	  
	  int[] resultant_array=reverse.reverseArray1(arr,arr.length);
	  
	  for(int i=0;i<resultant_array.length;i++) {
	
		  System.out.print(resultant_array[i]+" ");
	  }
	}
}