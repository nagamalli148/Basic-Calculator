package com.access.cinema;

import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	
	Scanner input=new Scanner(System.in);
	Cinema cinemaObj=new Cinema();
	
	System.out.println("Please Enter Movie Name");
	
	String xMovie=input.nextLine();
	
	cinemaObj.setMovie(xMovie);
	cinemaObj.fResult();	
}
}
