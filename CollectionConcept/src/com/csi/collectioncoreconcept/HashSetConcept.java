package com.csi.collectioncoreconcept;

import java.util.HashSet;

public class HashSetConcept {
	public static void main(String[] args) {

		HashSet<Integer>h1 =new HashSet<>();
		h1.add(12);
		h1.add(24);
		h1.add(36);
		h1.add(48);
		h1.add(60);
		h1.add(72);
		h1.add(84);
		h1.add(96);
		h1.add(12);
		h1.add(12);
		
		h1.forEach(System.out::println);
		
		
	}
}
