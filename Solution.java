package com.canessa.listsandsets;

/*
 * 
 */
public class Solution {

	// **** ****
	public static void main(String[] args) {

		// **** experiment with lists ****
		MyLists myLists = new MyLists();
		
		myLists.arrayLists();
		System.out.println();
		
		myLists.linkedLists();
		System.out.println();
		
		myLists.stacks();
		System.out.println();
		
		myLists.vectors();
		System.out.println();
		
		
		// **** experiment with sets ****
		MySets mySets = new MySets();
		
		mySets.hashSets();
		System.out.println();
		
		mySets.linkedHashSets();
		System.out.println();
		
		mySets.treeSets();
		System.out.println();
		
		
		// **** experiment with vectors and array lists ****
		MyVectorsAndArrays va = new MyVectorsAndArrays();

		va.vectors();
		System.out.println();
		
		va.arrayLists();
		System.out.println();
		
		
		// **** experiment with Hashtable and ConcurrentHashMap ****
		MyHashTableAndHashMap htm = new MyHashTableAndHashMap();
		
		htm.hashTable();
		System.out.println();
		
		htm.concurrentHashMap();
		System.out.println();
	}

}
