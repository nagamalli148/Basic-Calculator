package com.practice;
import java.util.Random;

public class RandomFunction {

	public static void main(String[] args) {
		Random r=new Random();
		
		System.out.println(r.nextInt(10));
		
		System.out.println(10*r.nextInt(10));
		
		System.out.println(r.nextDouble());
		System.out.println(r.nextFloat());

		System.out.println(Math.random());
		
		System.out.println(10*Math.random());
	}

}
