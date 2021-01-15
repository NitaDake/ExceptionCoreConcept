/**
 * 
 */
package com.csi.core;

import java.util.Scanner;

/**
 * @author Sunny
 *
 */
public class IFConcept {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("\nPlease enter the age:");
Scanner sc = new Scanner(System.in);
int age=sc.nextInt();
if(age>=18) {
	System.out.println("Eligible for vote");
}

	}

}
