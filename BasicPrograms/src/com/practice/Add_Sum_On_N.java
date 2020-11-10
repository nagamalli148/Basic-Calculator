package com.practice;

import java.util.*;
public class Add_Sum_On_N {
    int AddSub(int n,int opt){
        int m=n,sum=0;
        sum+=n;  
        n=n-1;
        if(opt==2)   //option 2 and N=6 , 6+5-4+3-2+1 (adding odd & sub even)
        {
            if(n%2==0){
                while(n>0){
                 if(n%2==0)
                    sum+=n;
                    else
                    sum-=n;
                    n--;
                }
            }
            else
            {
                while(n>0){
                    if(n%2==0)
                    sum-=n;
                    else
                    sum+=n;  //6+5=11
                    n--;  //5-1=4,4%2==0->sum=11-4=7,n=3=odd,sum=7+3=10,n=2=even,sum=10-2=8,1!=0,sum=8+1=9
                }
            }
        }
        else{                
        	/*
        	 * opt==1, N=6
        	 * sum=0+6
        	 * n=5
        	 * 
        	 * 
        	 */
            if(n%2==0){
                while(n>0){
                    if(n%2==0)
                    sum-=n;
                    else
                    sum+=n;
                    n--;
                }
            }
            else{
                while(n>0){
                    if(n%2==0)
                    sum+=n;
                    else
                    sum-=n;
                    n--;
                }
            }
        }
        return sum;
    }
    public static void main(String args[]) 
{
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int opt=sc.nextInt();
        Add_Sum_On_N obj=new Add_Sum_On_N();
        System.out.println(obj.AddSub(n,opt));
    }
}
