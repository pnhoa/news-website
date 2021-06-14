package com.nhuhoa.controller.admin;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MergeNames {
	 public static String[] uniqueNames(String[] names1, String[] names2) {
	        
	        Set<String> newStr = new HashSet<>(Arrays.asList(names1));
	        newStr.addAll(Arrays.asList(names2));
	       
	        return newStr.toArray(new String[0]);
	    }
	    
	    public static void main(String[] args) {
	    	int x, y;
	    	
			x = 5 >> 2;
			y = x >>> 2;
			System.out.println(x+" "+ y);
	        String[] names1 = new String[] {"Ava", "Emma", "Olivia"};
	        String[] names2 = new String[] {"Olivia", "Sophia", "Emma"};
	        System.out.println(String.join(", ", MergeNames.uniqueNames(names1, names2))); // should print Ava, Emma, Olivia, Sophia
	    }
}
