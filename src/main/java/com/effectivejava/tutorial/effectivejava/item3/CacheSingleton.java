package com.effectivejava.tutorial.effectivejava.item3;

import java.util.HashMap;
import java.util.Map;

public enum CacheSingleton implements Cache{
	instance;
	private HashMap<Object, Object> map = new HashMap<Object,Object>();

	@Override
	public void put(Object key, Object value) {
		// TODO Auto-generated method stub
		map.put(key, value);
	}

	@Override
	public Object get(Object key) {
		// TODO Auto-generated method stub
		return map.get(key);
	}

	
	
	
	
	


	
	
	
//	INSTANCE;
//
//	private Map<Object, Object> map = new HashMap<Object, Object>();
//	
//	 public void put(Object key, Object value) 
//	 {
//		 map.put(key, value);
//	 }
//
//	 public Object get(Object key) 
//	 {
//		 return map.get(key);
//	 }
	
}
