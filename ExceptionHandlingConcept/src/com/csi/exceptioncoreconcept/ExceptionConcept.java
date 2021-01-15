package com.csi.exceptioncoreconcept;

import java.util.Scanner;

public class ExceptionConcept {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("\n Please enter value of a:");
		System.out.println("\n Please enter value of b:");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int result = 0;
		try {
			// System.exit(0);
			result = a / b;
			System.out.println(result);
		} catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {// we can handle multiple exceptin in catch
			System.exit(0);
			// block separated by pipe operator
			// e.printStackTrace();
			// System.out.println(e.getMessage());=>gives only message /by zero
			// System.out.println(e);=>give exception name and message
			// System.out.println(e.getLocalizedMessage());=>gives only message /by zero
			// System.out.println(e.getStackTrace());=>[Ljava.lang.StackTraceElement;@7852e922
			// I AM NITA
			// System.out.println(e.getClass());=>class java.lang.ArithmeticException
			// I AM NITA
			// System.out.println(e.toString());=>java.lang.ArithmeticException: / by zero
			// I AM NITA
			e.printStackTrace();
		} catch (Exception e) {

		} finally {
			System.out.println("I AM NITA");

		}

	}
}
