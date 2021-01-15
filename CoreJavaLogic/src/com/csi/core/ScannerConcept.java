package com.csi.core;

import java.util.Scanner;

public class ScannerConcept {
	public static void main(String[] args) {
		System.out.println("please enter the employee id,employee name,employee salary");
		Scanner sc=new Scanner(System.in);
		int empId =sc.nextInt();
		String empName =sc.next();
		Double empSalary =sc.nextDouble();
		System.out.println("\n Employee Id:"+empId+"\nEmployee Name:"+empName+"\nEmployee salary:"+empSalary);
	}
}
