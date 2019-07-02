package com.canessa.listsandsets;

import java.util.Hashtable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;

/*
 * 
 */
public class MyHashTableAndHashMap {

	// **** ****
	final int MAX_ELEMENTS = 7;
	
	// **** constructor ****
	public MyHashTableAndHashMap() {
	}

	// **** hash table ****
	public void hashTable() {
		
		// **** ****
		Hashtable<Integer, Integer> ht = new Hashtable<Integer, Integer>();
		
		// **** ****
		CountDownLatch latch = new CountDownLatch(3);

		// **** create and start threads ****
		new Thread(new HashTableThread(ht,    0, 1000, latch)).start();
		new Thread(new HashTableThread(ht, 1000, 2000, latch)).start();
		new Thread(new HashTableThread(ht, 2000, 3000, latch)).start();

		// **** wait for all threads to finish ****
		try {
			latch.await();
		} catch (InterruptedException e) {
			System.err.println("hashTable <<< EXCEPTION " + e.getMessage());
			e.printStackTrace();
		}
		
		// **** ****
		System.out.println("hashTable <<<        ht: " + ht.toString());
		System.out.println("hashTable <<< ht.size(): " + ht.size());
	}
	
	// **** concurrent hash map ****
	public void concurrentHashMap() {
		
		// **** ****
		ConcurrentHashMap<Integer, Integer> chm = new ConcurrentHashMap<Integer, Integer>();
		
		// **** ****
		CountDownLatch latch = new CountDownLatch(3);
		
		// **** create and start threads ****
		new Thread(new HashMapThread(chm,    0, 1000, latch)).start();
		new Thread(new HashMapThread(chm, 1000, 2000, latch)).start();
		new Thread(new HashMapThread(chm, 2000, 3000, latch)).start();
		
		// **** wait for all threads to finish ****
		try {
			latch.await();
		} catch (InterruptedException e) {
			System.err.println("concurrentHashMap <<< EXCEPTION " + e.getMessage());
			e.printStackTrace();
		}
		
		// **** ****
		System.out.println("concurrentHashMap <<<        chm: " + chm.toString());
		System.out.println("concurrentHashMap <<< chm.size(): " + chm.size());
	
	}
}
