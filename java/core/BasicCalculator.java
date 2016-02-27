package com.acadglid.java.core;

import java.util.Scanner;

public class BasicCalculator {



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean isNextCheck=true;
		
		Scanner s = new Scanner(System.in);
		while(isNextCheck){
			System.out.println("Enter first operand");
			int number1=s.nextInt();
			
			System.out.println("enter the operator \n \t '+' \n\t '-' \n\t'*' \n\t'/'");
			char ch=(char)s.next().charAt(0);
			System.out.println("enter the second operand");
			int number2=s.nextInt();
			
			
	
			switch(ch){
			case '+':
				System.out.println("value is "+(number1+number2));
				break;
			case '-':
				System.out.println("value is " + (number1-number2));
				break;
			case '*':
				System.out.println("Value is " + (number1*number2));
				break;
			case '/':
				if(number2 >0)
					System.out.println("value is " + (number1/number2));
				break;
			default:
				System.out.println("Invalid operand");
				break;
			}
			//System.out.println(s.next());
			if (s.next().toLowerCase().equals("off")){
				isNextCheck=false;
				System.out.println("its here");
			}
			
		}
	}

}
