package com.practice;

import java.util.*;

public class SortArray {
public static void main(String[] args) 
{
	int[] arr= {13,6,9,1,8,19,108};
	String arr2[]= {"IBM","Cognizant","Wipro","Wtn"};
	Arrays.sort(arr);
	Arrays.sort(arr2);
	
	System.out.println("Sorted Array is: "+Arrays.toString(arr));
	System.out.println("Sorted strings are: "+Arrays.toString(arr2));	
}	
}
