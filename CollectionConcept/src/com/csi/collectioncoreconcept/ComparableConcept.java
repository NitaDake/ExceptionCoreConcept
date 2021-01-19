package com.csi.collectioncoreconcept;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Employee implements Comparable<Employee> {
	int empId;
	String empName;

	public Employee(int empId, String empName, int empAge) {
		
		this.empId = empId;
		this.empName = empName;
		this.empAge = empAge;
	}

	int empAge;

	@Override
	public int compareTo(Employee e1) {
		// TODO Auto-generated method stub
		if(empAge==e1.empAge) {
			return 0;
		}else if(empAge<e1.empAge) {
			return 1;
		}else {
			return-1;
		}

	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empAge=" + empAge + "]";
	}
}

public class ComparableConcept {
	public static void main(String[] args) {
List<Employee> empList =new ArrayList<Employee>();
empList.add(new Employee(121, "NITA", 12));
empList.add(new Employee(122, "PRAVIN", 13));
empList.add(new Employee(123, "ANITA", 23));
empList.add(new Employee(124, "VANITA", 98));
empList.add(new Employee(126, "PRANITA", 56));

Collections.sort(empList);
empList.forEach(System.out::println);

	}
}
