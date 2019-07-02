package com.canessa.listsandsets;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;


/*
 * 
 */
public class MyLists {

	// **** ****
	final int MAX_ELEMENTS = 7;
	
	// **** constructor ****
	public MyLists() {
	}
	
	
	// **** array lists ****
	public void arrayLists() {
		
		// **** ****
		List<Integer> al = new ArrayList<Integer>();
		
		// **** populate the array list ****
		for (int i = 0; i < MAX_ELEMENTS; i++) {
			al.add(i);
		}

		// **** display the array list ****
		System.out.println("arrayLists <<< al.size: " + al.size());
		System.out.println("arrayLists <<<      al: " + al.toString());
		
		System.out.print("arrayLists <<< getting: [");
		while (al.size() > 0) {
			if (al.size() > 1)
				System.out.print(al.remove(0) + ", ");
			else
				System.out.print(al.remove(0) + "]");
		}
		System.out.println();
	}
	
	
	// **** linked lists ****
	public void linkedLists() {
		
		// **** ****
		List<Integer> ll = new LinkedList<Integer>();
		
		// **** populate the linked list ****
		for (int i = 0; i < MAX_ELEMENTS; i++) {
			ll.add(i);
		}
		
		// **** display the linked list ****
		System.out.println("linkedLists <<<  ll.size: " + ll.size());
		System.out.println("linkedLists <<<       ll: " + ll.toString());
		
		System.out.print("linkedLists <<< removing: [");
		while (ll.size() > 0) {
			if (ll.size() > 1)
				System.out.print(ll.remove(0) + ", ");
			else
				System.out.print(ll.remove(0) + "]");
		}
		System.out.println();
	}
	
	
	// **** ****
	public void stacks() {
		
		// **** ****
		Stack<Integer> s = new Stack<Integer>();
		
		// **** ****
		for (int i = 0; i < MAX_ELEMENTS; i++) {
			s.push(i);
		}
		
		// **** ****
		System.out.println("stacks <<< s.size: " + s.size());
		System.out.println("stacks <<<    top: " + s.elementAt(0));
		System.out.println("stacks <<<      s: " + s.toString());
		
		// **** pop elements ****
		System.out.print("stacks <<< poping: [");
		while (!s.empty()) {
			if (s.size() > 1)
				System.out.print(s.pop() + ", ");
			else
				System.out.print(s.pop() + "]");
		}
		System.out.println();
	}
	
	
	// **** ****
	public void vectors() {
		
		// **** ****
		Vector<Integer> v = new Vector<Integer>();
		
		// **** ****
		for (int i = 0; i < MAX_ELEMENTS; i++)
			v.addElement(i);
		
		// **** ****
		System.out.println("vectors <<< v.size: " + v.size());
		System.out.println("vectors <<<      v: " + v.toString());
		
		System.out.print("vectors <<<      v: [");
		while (v.size() > 0) {
			if (v.size() > 1)
				System.out.print(v.remove(0) + ", ");
			else
				System.out.print(v.remove(0) + "]");
		}
		System.out.println();
	}
}
