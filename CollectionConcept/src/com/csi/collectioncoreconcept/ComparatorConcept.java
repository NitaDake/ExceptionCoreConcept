package com.csi.collectioncoreconcept;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Customer {
	int custId;
	String custName;
	double custSalary;

	public Customer(int custId, String custName, double custSalary) {

		this.custId = custId;
		this.custName = custName;
		this.custSalary = custSalary;
	}

	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", custName=" + custName + ", custSalary=" + custSalary + "]";
	}
}

class NameComparator implements Comparator<Customer> {

	@Override
	public int compare(Customer c1, Customer c2) {
		// TODO Auto-generated method stub
		return c1.custName.compareTo(c2.custName);
	}
}


class IdComparator implements Comparator<Customer> {

	@Override
	public int compare(Customer c1, Customer c2) {
		// TODO Auto-generated method stub
		if(c1.custId==c2.custId) {
			return 0;
		}else if(c1.custId<c2.custId) {
			return 1;
			
		}else {
			return -1;
		}
	
	}
	
	
}
class SalaryComparator implements Comparator<Customer> {

	@Override
	public int compare(Customer c1, Customer c2) {
		// TODO Auto-generated method stub
		if (c1.custSalary == c2.custSalary) {
			return 0;

		} else if (c1.custSalary > c2.custSalary) {
			return 1;

		} else {
			return -1;
		}
	}
}

public class ComparatorConcept {
	public static void main(String[] args) {

		List<Customer> custList = new ArrayList<>();
		custList.add(new Customer(111, "NITA", 362463.43));
		custList.add(new Customer(112, "PRANITA", 382463.43));
		custList.add(new Customer(11, "VANITA", 362963.43));
		custList.add(new Customer(114, "ANITA", 362463.90));

		System.out.println("\n Name Comparator");

		Collections.sort(custList, new NameComparator());
		custList.forEach(System.out::println);

		System.out.println("\n salary Comparator");
		Collections.sort(custList, new SalaryComparator());
		custList.forEach(System.out::println);
		
		
		System.out.println("\n id Comparator");
		Collections.sort(custList,new IdComparator());
		custList.forEach(System.out::println);
		

	}
}
