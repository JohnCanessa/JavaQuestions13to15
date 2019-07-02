package com.canessa.listsandsets;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

/*
 * 
 */
public class MySets {

	// **** ****
	final int MAX_ELEMENTS = 7;
	
	// **** constructor ****
	public MySets() {
	}

	
	// **** hash set ****
	public void hashSets() {
		
		// **** ****
		HashSet<Integer> hs = new HashSet<Integer>();
		
		// **** add elements to the hash set ****
		for (int i = 0; i < MAX_ELEMENTS; i++)
			hs.add(i);
		
		for (int i = 0; i < MAX_ELEMENTS; i++) {
			boolean added = hs.add(i);
			if (!added)
				System.out.println("hashSets <<< hs.add(" + i + "): added: " + added);
		}

		// **** display the hash set ****
		System.out.println("hashSets <<< toString() hs: " + hs.toString() + "\n");
		
		
		// **** iterate through the hash set ****
		Iterator<Integer> it = hs.iterator();
		
		System.out.print("hashSets <<< iterate hs: [");
		while (it.hasNext()) {
			int i = it.next();
			if (it.hasNext())
				System.out.print(i + ", ");
			else
				System.out.print(i + "]");
		}
		System.out.println("\n");
		
		// **** loop removing elements from the hash set ****
		for (int i = 0; i < MAX_ELEMENTS; i++) {
			boolean removed = hs.remove(i);
			if (!removed)
				System.out.println("hashSets <<< hs.remove(" + i + "): removed: " + removed);
		}
		
		// **** display the hash set ****
		System.out.println("hashSets <<< toString() hs: " + hs.toString() + "\n");

		// **** ****
		for (int i = 0; i < MAX_ELEMENTS; i++) {
			boolean removed = hs.remove(i);
			if (!removed)
				System.out.println("hashSets <<< hs.remove(" + i + "): removed: " + removed);
		}
	}
	
	// **** linked hash set ****
	public void linkedHashSets() {
		
		// **** ****
		LinkedHashSet<Integer> lhs = new LinkedHashSet<Integer>();
		
		// **** ****
		for (int i = 0; i < MAX_ELEMENTS; i++)
			lhs.add(i);
		
		// **** add a null to the linked hash set ****
		lhs.add(null);
		
		// **** ****
		System.out.println("linkedHashSets <<< lhs: " + lhs.toString());
		
		// **** remove the 4 ****
		lhs.remove(4);
		
		// **** display the linked hash set ****
		System.out.println("linkedHashSets <<< lhs: " + lhs.toString());

		// **** add a 4 ****
		lhs.add(4);
		
		// **** display the linked hash set ****
		System.out.println("linkedHashSets <<< lhs: " + lhs.toString());
		
		// **** iterate through the linked has set ****
		Iterator<Integer> it = lhs.iterator();
		System.out.print("linkedHashSets <<< lhs: [");
		while (it.hasNext()) {
			int i = 0;
			Object obj = it.next();

			// **** ****
			if (obj == null) {
				if (it.hasNext())
					System.out.print("null, ");
				else
					System.out.print("null");
				continue;
			}
			
			// **** *****
			else
				i = (int)obj;
			
			// **** ****
			if (it.hasNext())
				System.out.print(i + ", ");
			else
				System.out.print(i);
		}
		
		System.out.println("]");
	}
	
	// **** tree set ****
	public void treeSets() {
		
		// **** ****
		TreeSet<Integer> ts = new TreeSet<Integer>();
		
		// **** ****
		for (int i = MAX_ELEMENTS - 1; i >= 0; i--) {
			ts.add(i);
		}
		
		// **** ****
		System.out.println("treeSets <<< ts: " + ts.toString());
		
		// **** ****
		ts.remove(4);
		
		// **** ****
		System.out.println("treeSets <<< ts: " + ts.toString());

		// **** ****
		ts.add(4);
		
		// **** ****
		System.out.println("treeSets <<< ts: " + ts.toString());
		
		// **** ****
		boolean added = ts.add(3);
		System.out.println("treeSets <<< added 3: " + added);
	
		// **** iterate through the tree set ****
		Iterator<Integer> it = ts.iterator();
		System.out.print("treeSets <<< ts: [");
		while (it.hasNext()) {
			int i = (int)it.next();
			if (it.hasNext())
				System.out.print(i + ", ");
			else
				System.out.print(i);
		}
		System.out.println("]");		
	}
	
}
