package com.effectivejava.tutorial.effectivejava.item2;

public class Starbucks {
	
	// Gerekli
	private String kahveBoyutu;
	
	// Seçime göre değişir
	private String laktozsuzSütMiktarı;
	private String yumuşatıcı;
	
	
	

	
	
	
//**********************************************************************************************	
//	JavaBeans Pattern
	
	
	public Starbucks() {
		
	}
	
	
	public void setKahveBoyutu(String kahveBoyutu) {
		this.kahveBoyutu = kahveBoyutu;
	}



	public void setLaktozsuzSütMiktarı(String laktozsuzSütMiktarı) {
		this.laktozsuzSütMiktarı = laktozsuzSütMiktarı;
	}



	public void setYumuşatıcı(String yumuşatıcı) {
		this.yumuşatıcı = yumuşatıcı;
	}

	
//**********************************************************************************************	
	
	
	
	//	telescope pattern
	
	


	public Starbucks(String kahveBoyutu, String yumuşatıcı) {
		super();
		this.kahveBoyutu = kahveBoyutu;
		this.yumuşatıcı = yumuşatıcı;
	}



	public Starbucks(String yumuşatıcı) {
		super();
		this.yumuşatıcı = yumuşatıcı;
	}



	
	
	
	
		
	
	

	


}
