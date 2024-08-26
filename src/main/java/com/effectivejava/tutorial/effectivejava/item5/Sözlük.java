package com.effectivejava.tutorial.effectivejava.item5;

public class Sözlük {
	

	private String dil;

	public Sözlük(String dil) {
//		dil_ = dil; //if we define dil_ above, we can use it here without this
		this.dil=dil;
	}
	

	public static Boolean isValid() {
		return true;
		
	}
	
	
	public String toString() {
		return dil;
		
	}
	
	
	
}
