package com.acadglid.java.core;

import java.util.Random;
import java.util.Scanner;

public class RandomNumber {

	private static Scanner s;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
			s = new Scanner(System.in);
			System.out.println("Enter the number");
			int number=s.nextInt();
			System.out.println("Random number genearted is "+ getRandomNumber(number));
	}
	
	static int getRandomNumber(int number){
		return new Random().nextInt(number);
	}

}
