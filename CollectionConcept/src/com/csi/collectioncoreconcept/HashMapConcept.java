package com.csi.collectioncoreconcept;

import java.util.HashMap;
import java.util.Map;

public class HashMapConcept {
	public static void main(String[] args) {
		HashMap<String, String> h1 = new HashMap<>();
		h1.put("empId", "121");
		h1.put("empName", "NITA");
		h1.put("empSalary", "378473.834");
		h1.put("empAddress", "PUNE");
		h1.put("empPinCode", "414848");
		//h1.put("null", "null");
		h1.put("null", "nita");
		
//		for (Map.Entry<String, String> m : h1.entrySet()) {
//			System.out.println("key:" + m.getKey() + ":" + "value:" + m.getValue());
//		}
		System.out.println(h1.containsValue("414848"));
		System.out.println(h1.replace("empSalary", "378473.834","478473.834"));
		
//		
//		for (Map.Entry<String, String> m : h1.entrySet()) {
//		System.out.println("key:" + m.getKey() + ":" + "value:" + m.getValue());
	}
	}

