package com.effectivejava.tutorial.effectivejava.item3;

import java.util.HashMap;

public class LazyCache implements Cache {

	private static LazyCache instance;
	private HashMap<Object, Object> map;

	private LazyCache() {
		map = new HashMap<Object, Object>();
	}

	@Override
	public void put(Object key, Object value) {
		// TODO Auto-generated method stub
		map = new HashMap<Object, Object>();
	}

	@Override
	public Object get(Object key) {
		// TODO Auto-generated method stub

		return map.get(key);
	}

	public static LazyCache getInstance() {

		if (instance == null) 
		{
			instance = new LazyCache();
		}
		return instance;

	}

}
