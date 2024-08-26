package com.effectivejava.tutorial.effectivejava.item3;

import java.util.HashMap;

public class EagerCache implements Cache {
	
	private HashMap<Object,Object> map;
	
	private static final EagerCache instance= new EagerCache();
	
	
	private EagerCache(){
		
		map= new HashMap<Object,Object>();
	}

	@Override
	public void put(Object key, Object value) {
		// TODO Auto-generated method stub
		map= new HashMap<Object,Object>();
		
	}

	@Override
	public Object get(Object key) {
		// TODO Auto-generated method stub
		return map.get(key);
	}
	
		
	
	public static EagerCache getInstance(){
			
			return instance;
		}

	
	
	
	
	
	
	
	
	
	
//	private static final EagerCache instance = new EagerCache();
//	private HashMap<Object, Object> map;
//
//	private EagerCache() { 
//		map = new HashMap<Object, Object>();
//	}
//
//	public void put(Object key, Object value) {
//		map = new HashMap<Object, Object>();
//	}
//
//	public Object get(Object key) {
//		return map.get(key);
//	}
//	
//    public static EagerCache getInstance(){
//        return instance;
//    }

}
