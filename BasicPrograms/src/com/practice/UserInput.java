package com.practice;
import java.util.Scanner;
public class UserInput {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String movie;
	System.out.println("Give Movie");
	movie=sc.nextLine();
	System.out.println("Movie: "+movie);
	
	int rating;
	System.out.println("Give Rating: ");
	rating=sc.nextInt();
	System.out.println("Rating : "+rating);
}
}
