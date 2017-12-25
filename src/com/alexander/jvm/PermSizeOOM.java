package com.alexander.jvm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PermSizeOOM {
	
	public static void main(String[] args){
		
		String s1 = "Alexander";
		
		Map<String,String> temp = new HashMap<String,String>();
		temp.put("1", "Alex");
		temp.put("2", "ander");
		String s2 = temp.get("1") + temp.get("2");
		System.out.println("s1==s2 is: " + s1==s2);
		
		List<String> list = new ArrayList<String>();
		int i = 0;
		while(true){
			System.out.println(i);
			list.add(String.valueOf(i++).intern());
		}
		
	}
}
