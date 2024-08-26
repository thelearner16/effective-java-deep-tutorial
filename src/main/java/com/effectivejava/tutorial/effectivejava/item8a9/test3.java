package com.effectivejava.tutorial.effectivejava.item8a9;

import org.testng.annotations.Test;

public class test3 {
	
	@Test
	public void t() {
	try {
		 int a = 10 / 0;
		 System.out.println("This will not be printed");
		 } catch (Exception e) {
		 System.out.println("Exception caught");
		 } finally {
		 System.out.println("Finally block executed");
		 }
	}


	@Test
	private void s() {
		// TODO Auto-generated method stub
		int a = 5;
		 int b = 10;
		 if ((a = 3) == b) {
		 System.out.println(a);
		 } else {
		 System.out.println(a + b);
		 }
	}
	
	@Test
	private void pu() {
		// TODO Auto-generated method stub
		System.out.println(Math.min(Double.MIN_VALUE, 0.0d));
	}
	
	
	
	@Test
	private void pub() {
		// TODO Auto-generated method stub
		 int z = 0;
		 System.out.println(z++ == ++z);
	}





}






