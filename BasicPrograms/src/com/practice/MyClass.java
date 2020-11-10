package com.practice;

import java.util.*;
public class MyClass {
    public int findKey(int input1[],int input2){
        int flag=0,k=0,key,add;
        int a[]=new int[input2];
        for(int i=0;i<input2;i++)
        {
            
            if(input1[i]<0){
                flag=1;
                break;
            }
        }
        if(flag ==0)
        
        {
            Arrays.sort(input1);
            return input1[input1.length-1];
        }
        
        else
         {
            key=Integer.parseInt(String.valueOf((String.valueOf(input1[0])).charAt(0)));
            a[k++]=key;
            input1[0]=Integer.parseInt(String.valueOf((String.valueOf(input1[0])).substring(1,String.valueOf(input1[0]).length())));
            add=input1[0];
            while(input1[add]>0)
            {
            
            key=Integer.parseInt(String.valueOf((String.valueOf(input1[add])).charAt(0)));
                a[k++]=key;            
            input1[add]=Integer.parseInt(String.valueOf((String.valueOf(input1[add])).substring(1,String.valueOf(input1[add]).length())));
                add=input1[add];
            } 
            
        input1[add]=-input1[add];  
        a[k++]=Integer.parseInt(String.valueOf((String.valueOf(input1[add])).charAt(0))); //7
        } 
       
        int sum=a[0];
      for(int i=1;i<k;i++) 
     {
            if(i%2==1)
            sum+=a[i];
            else
            sum-=a[i];
    }
      return sum;
    }
public static void main(String args[]) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int a[]=new int[n];
    for(int i=0;i<n;i++)
         a[i]=sc.nextInt();
    System.out.println(new MyClass().findKey(a,n));
    }
}
