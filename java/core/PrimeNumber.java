package com.acadglid.java.core;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the number");
		
		int number=s.nextInt();
		
		System.out.println(checkPrime(number) ? (number+" is Prime"): (number+" is not prime"));

	}
	static boolean checkPrime(int number){
		boolean isPrime=true;
		for(int i=2;i<number/2;i++){
			if (number % i == 0){
				
				isPrime=false;
				break;
			}
		}
		return isPrime;
	}

}
