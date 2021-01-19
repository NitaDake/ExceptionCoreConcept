package com.csi.collectioncoreconcept;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ArrayListConcept {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	 System.out.println("Enter branch Name:");
		String branchName = sc.next();
		ArrayList<String> a1 = new ArrayList<>();
		a1.add("IT");
		a1.add("COMPUTER");
		a1.add("E&TC");
		a1.add("CHEMICAL");
		a1.add("PETROLIUM");
		a1.add("MECHANICAL");
		a1.add("CIVIL");
		
		
		ArrayList<String>a2 =new ArrayList<>();
		a2.add("IT");
		a2.add("COMPUTER");
		a2.add("E&TC");
		a2.add("CHEMICAL");
		a2.add("PETROLIUM");
		a2.add("MECHANICAL");
	
		
		/*
		System.out.println(a1.equals(a2));
		System.out.println(a1.get(1));
		System.out.println(a1.indexOf("CIVIL"));
		System.out.println(a1.isEmpty());
		System.out.println(a1.lastIndexOf("COMPUTER"));
		System.out.println(a1.remove(0));
		System.out.println(a1);
		System.out.println(a1.add("IT"));
		System.out.println(a1);
		System.out.println(a1.clone());
		System.out.println(a1.set(0, "ELECTRICAL"));
		System.out.println(a1.size());
		System.out.println(a1.getClass());
		System.out.println(a1.contains("IT"));
		*/
		
		
		//a1.equals(a2);
		//System.out.println(a1);

		/*
		 * Iterator<String> itr =a1.iterator(); while(itr.hasNext()) {
		 * System.out.println(itr.next()); }
		 */



		// Three types of for loop
		// .........1.using Lambdaexpression.......//

		// a1.forEach(branchName -> System.out.println(branchName));

		// .........2.using method reference operator.......//

		// a1.forEach(System.out::println);

		// .........3.using assign value operator.......//

		/*for(String bName:a1) {
			System.out.println(bName);
		}*/




		
		  if(a1.contains(branchName)) 
		  { System.out.println("available"); }
		  else {
			  a1.add(branchName);
			  System.out.println(a1);
		   }
		 
		
		
		/*ArrayList<Integer>i1=new ArrayList<>();
		i1.add(2);
		i1.add(4);
		i1.add(6);
		i1.add(8);
		i1.add(10);
		i1.add(12);
		i1.add(14);
		i1.add(16);
		//i1.forEach(table2->System.out.println(table2));
		//i1.forEach(System.out::println);
		for(int a:i1) {
			System.out.println(a);
		}
		*/
		

	}
}
