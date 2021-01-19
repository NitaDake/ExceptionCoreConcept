package com.csi.collectioncoreconcept;

import java.util.TreeSet;

public class TreeSetConcept {
public static void main(String[] args) {
	TreeSet<String>t1 =new TreeSet<>();
	t1.add("PUNE");
	t1.add("AHMEDNAGAR");
	t1.add("DHULE");
	t1.add("SANGALI");
	t1.add("NASHIK");
	t1.add("KOLHAPUR");
	t1.add("SATARA");
	t1.add("JALGOAN");
	t1.add("VARDHA");
	t1.add("VARDHA");
	t1.add("VARDHA");
	
//for(String city :t1) {
//		System.out.println(city);
//}
//	
	
	
System.out.println(t1.remove("SDGFG"));
for(String city :t1) {
System.out.println(city);
}
	
//	System.out.println(t1.ceiling("PUNE"));
//	System.out.println(t1.lower("DHULE"));
	
}
}
