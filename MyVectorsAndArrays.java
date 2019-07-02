package com.canessa.listsandsets;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Vector;

/*
 * 
 */
public class MyVectorsAndArrays {

	// **** ****
	final int MAX_ELEMENTS = 13;
	
	// **** constructor ****
	public MyVectorsAndArrays() {
	}

	// **** vectors ****
	public void vectors() {
		
		// **** ****
		Vector<Integer> v = new Vector<Integer>();
		System.out.println("vectors <<< capacity: " + v.capacity());
		
		// **** ****
		for (int i = 0; i < MAX_ELEMENTS; i++) {
			v.add(i);
			System.out.println("vectors <<<        v: " + v.toString());
			System.out.println("vectors <<< capacity: " + v.capacity());
		}
		
		// **** ****
		while (v.size() > 0) {
			int x = v.remove(0);
			System.out.println("vectors <<<        x: " + x);
			System.out.println("vectors <<<        v: " + v.toString());
			System.out.println("vectors <<< capacity: " + v.capacity());
		}
	}
	
	// **** array list ****
	public void arrayLists() {
		
		// **** ****
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		// **** ****
		for (int i = 0; i < MAX_ELEMENTS; i++)
			al.add(i);
		
		// **** ****
		System.out.println("arrayLists <<< al: " + al.toString());
		
		// **** ****
		al.remove(4);
		
		// **** ****
		System.out.println("arrayLists <<< al: " + al.toString());
		
		// **** ****
		al.add(4, MAX_ELEMENTS);
	
		// **** ****
		System.out.println("arrayLists <<< al: " + al.toString());

		// **** iterate through the array list ****
		Iterator<Integer> it = al.iterator();
		System.out.print("arrayLists <<< al: [");
		while (it.hasNext()) {
			int i = it.next();
			if (it.hasNext())
				System.out.print(i + ", ");
			else
				System.out.println(i + "]");
		}
	}
}
