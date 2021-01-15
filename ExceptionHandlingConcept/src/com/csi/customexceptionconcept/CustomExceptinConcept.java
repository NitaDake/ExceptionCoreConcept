package com.csi.customexceptionconcept;

public class CustomExceptinConcept {
	public static void main(String[] args) {
		ageInvalid(10);
	}
public static void ageInvalid(int age) {
	if(age<18) {
		try {
			throw new InvaliAgeException("Invalid Age");
		} catch (InvaliAgeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	} else {
		System.out.println("valid Age");
	}
}
}
