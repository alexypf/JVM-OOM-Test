package com.alexander.jvm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PermSizeOOM {
	
	static String prefix = "Alex";
	static String suffix = "ander";

	public static void main(String[] args) {

		// String s1 = "Alexander";

		// Map<String,String> temp = new HashMap<String,String>();
		// temp.put("1", "Alex");
		// temp.put("2", "ander");
		// String s2 = temp.get("1") + temp.get("2");
		// System.out.println("s2 : " + s2);
		// System.out.println("s1==s2 is: " + s1==s2);
		//
		// List<String> list = new ArrayList<String>();
		// int i = 0;
		// while(true){
		// System.out.println(i);
		// list.add(String.valueOf(i++).intern());
		// }

		List<String> list = new ArrayList<String>();
		for (int i = 0; i < Integer.MAX_VALUE; i++) {
			System.out.println(i);
			String str = prefix + suffix;
			prefix = str;
			list.add(str.intern());
		}

	}
}
