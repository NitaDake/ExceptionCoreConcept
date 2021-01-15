package com.csi.core;

import java.util.Scanner;

public class NestedIfEleseConcept {
	public static void main(String[] args) {
		System.out.println("\nPlease enter the marks:");
		Scanner sc = new Scanner(System.in);
		int mark =sc.nextInt();
		if(mark>=70) {
			System.out.println("First class with  distinction");
			
		}
		else if  (mark<70 && mark>=60) {
			System.out.println("First class ");
		}
		else if  (mark<60 && mark>=50) {
			System.out.println(" higher second class ");
		}
		else if  (mark<50 && mark>=40) {
			System.out.println("second class ");
		}
		else if  (mark<40 && mark>=35) {
			System.out.println("pass class ");
		}
		else if  (mark<35 ) {
			System.out.println("fail ");
		}
	}

}
