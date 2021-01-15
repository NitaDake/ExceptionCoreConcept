package com.csi.exceptioncoreconcept;

import java.util.Scanner;

public class ThrowBlockConcept {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("\n Please enter value of a:");
		System.out.println("\n Please enter value of b:");
		int a = sc.nextInt();
		int b = sc.nextInt();

		int result = 0;
		try {
			result = a / b;
			System.out.println(result);
		} catch (ArithmeticException e) {
			e.printStackTrace();
		}
		isAgeValid(1);
	}
//here we created custom exception using  throws key word
	public static void isAgeValid(int age) {
		if (age < 18) {
			throw new ArithmeticException("Invalid Age");
		} else {
			System.out.println("valid age");
		}
	}

}
