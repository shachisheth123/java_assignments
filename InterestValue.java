package basic_assignments;

import java.util.Scanner;
import java.io.*;
import java.lang.*;

public class InterestValue {

	final double rate_Of_Int = 9.04;

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		InterestValue iv = new InterestValue();
		
		System.out.println("choose: 1.Simple Interest 2.compound Interest");
		int choice=sc.nextInt();
		int ch=choice;
		switch(ch) {
		
		case 1:System.out.println(iv.simpleInterest());
				break;
		
		case 2:	System.out.println(iv.compoundInterest());
				break;
		}
		
		sc.close();
		
	
	}

	public double simpleInterest() {

		int principal;
		int no_Of_Years;
		double simple_Int;

		System.out.println("Enter the principal amount");
		principal = sc.nextInt();

		System.out.println("Eneter the Number of Years ");
		no_Of_Years = sc.nextInt();

		simple_Int = (principal * no_Of_Years * rate_Of_Int) / 100;

		return simple_Int;

	}
	
	public double compoundInterest()
	{
		
		int principal = 0;
		int no_Of_Years = 0;
		double compound_Interest;
		
		System.out.println("Enter the principal amount");
		principal = sc.nextInt();

		System.out.println("Eneter the Number of Years ");
		no_Of_Years = sc.nextInt();
		
		compound_Interest=principal*(Math.pow((1+rate_Of_Int/100),no_Of_Years));
		
		
		return compound_Interest;
		
		
	}

}
