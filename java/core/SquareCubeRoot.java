package com.acadglid.java.core;

import java.util.Scanner;

public class SquareCubeRoot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the number");
		int number=s.nextInt();
		
		System.out.println("enter the option for calculator");
		System.out.println("1 for square root");
		System.out.println("2 for cube root");
		int option=s.nextInt();
		switch(option){
		case 1: 
			squareroot(number);
			break;
		case 2:
			cuberoot(number);
			break;
		default:
			System.out.println("Wrong options");
			break;
		}
	}
	static void squareroot(int number){
		System.out.println("The Square root is"+ (double)Math.sqrt(number));
	}
	static void cuberoot(int number){
		System.out.println("The cube root of number is " +(double)Math.cbrt(number));
	}

}
