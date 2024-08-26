package com.effectivejava.tutorial.effectivejava.item3;

public class ItemThreeTest2 {
	
	public static void main(String[] args) {

		
		
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
			
				try {
					Thread.sleep(1);
				} catch (Exception e) {
					// TODO: handle exception
				}
				
				
				
				System.out.println("thread 1 HashCode of LazyCash: " + LazyCache.getInstance().hashCode());
				System.out.println("thread 1 HashCode of EagerCash: " + EagerCache.getInstance().hashCode());
				System.out.println("thread 1 HashCode of CashSingleton: " + CacheSingleton.instance.hashCode());
				
				
			}
		}).start();

		
	
		
		
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
			
								
				System.out.println("thread 2 HashCode of LazyCash: " + LazyCache.getInstance().hashCode());
				System.out.println("thread 2 HashCode of EagerCash: " + EagerCache.getInstance().hashCode());
				System.out.println("thread 2 HashCode of CashSingleton: " + CacheSingleton.instance.hashCode());
				
				
			}
		}).start();

		

	}
	
	
	
	
	
	
	
	
	

}
