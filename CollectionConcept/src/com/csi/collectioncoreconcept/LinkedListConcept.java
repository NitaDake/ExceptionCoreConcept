package com.csi.collectioncoreconcept;

import java.util.LinkedList;

public class LinkedListConcept {
	public static void main(String[] args) {
		LinkedList<String> l1=new LinkedList<>();
		l1.add("PUNE");
		l1.add("AHMEDNAGAR");
		l1.add("DHULE");
		l1.add("SANGALI");
		l1.add("NASHIK");
		l1.add("KOLHAPUR");
		l1.add("SATARA");
		l1.add("JALGOAN");
		l1.add("VARDHA");
		l1.add("VARDHA");
		System.out.println(l1.add("VARDHA"));
		System.out.println(l1.containsAll(l1));
		System.out.println(l1.getLast());
		System.out.println(l1.offer("PUNE"));
		System.out.println(l1.indexOf("VARDHA"));
		System.out.println(l1.peekFirst());
		System.out.println(l1.peek());
		System.out.println(l1.pop());
		System.out.println(l1.set(10, "BEED"));
		System.out.println(l1);
		
		//l1.forEach(city->System.out.println(city));

	}

}
