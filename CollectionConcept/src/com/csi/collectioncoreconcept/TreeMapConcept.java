package com.csi.collectioncoreconcept;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapConcept {
	public static void main(String[] args) {
		TreeMap<String, Integer> tm = new TreeMap<>();

		tm.put("empId", 191);
		tm.put("empSalary", 191876);
		tm.put("empAge", 19);
		tm.put("empcode", 101);
		tm.put("empPinCode", 411812);
		tm.put(null, 100);
		
		// for(Map.Entry<String, Integer>t:tm.entrySet()) {
		// System.out.println("Key:"+t.getKey()+":"+"value:"+t.getValue());
		// }

//		System.out.println(tm.containsKey("empId"));
//
//		System.out.println(tm.containsValue(191));
//		System.out.println(tm.firstKey());
//		System.out.println(tm.remove("empId"));
		
		for (Map.Entry<String, Integer> t : tm.entrySet()) {
			System.out.println("Key:" + t.getKey() + ":" + "value:" + t.getValue());
		}

	}
}
