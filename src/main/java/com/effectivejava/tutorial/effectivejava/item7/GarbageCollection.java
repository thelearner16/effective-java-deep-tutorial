package com.effectivejava.tutorial.effectivejava.item7;

import ch.qos.logback.core.recovery.ResilientSyslogOutputStream;

public class GarbageCollection {

	public void finalize()
	{
		System.out.println("Çöpler temizlendi.");
	}

	
	public static void main(String[] args) {
		
		long start = System.nanoTime();
		
		GarbageCollection ali1= new GarbageCollection();
		GarbageCollection veli= new GarbageCollection();
		GarbageCollection sila= new GarbageCollection();

		long start2 = System.nanoTime();
		long duration1 = start2-start;
		
		ali1 = null;
		
		veli=sila;
		
		System.gc();
		
		
		long end = System.nanoTime();
		
		long duration2 = end- start2;
		

		System.out.println("after 3 GarbageCollection initialized: " + duration1);
		System.out.println("after System.gc: " + duration2);
		
	
	}

}
