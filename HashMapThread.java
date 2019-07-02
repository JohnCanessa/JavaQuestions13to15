package com.canessa.listsandsets;

import java.util.concurrent.*;

/*
 * 
 */
public class HashMapThread implements Runnable {

	// **** members ****
	ConcurrentHashMap<Integer, Integer>	ht;
	int 								begin;
	int 								end;
	CountDownLatch 						latch;
	
	// **** constructor ****
	public HashMapThread(ConcurrentHashMap<Integer, Integer> ht, int begin, int end, CountDownLatch latch) {
		this.ht 	= ht;
		this.begin	= begin;
		this.end	= end;
		this.latch 	= latch;
	}

	// **** ****
	@Override
	public void run() {
		
		// **** do some work ****
		for (int i = begin; i < end; i++) {
			ht.put(i, i * 2);
		}
		
		// **** flag that this thread is done ****
		latch.countDown();
	}
	
}

