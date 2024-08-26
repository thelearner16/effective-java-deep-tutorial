package com.effectivejava.tutorial.effectivejava.item5;

import java.time.LocalDate;
import java.util.function.Supplier;

public class ItemFiveTest {

	public static void main(String[] args) {
			


		YazıAnaliziSingleton.INSTANCE.isValid();
		
		
		YazıAnaliziDependencyInjection turkce= new YazıAnaliziDependencyInjection(new Sözlük("Türkçe") );
		System.out.println(turkce.isValid());
		
		YazıAnaliziDependencyInjection english= new YazıAnaliziDependencyInjection(new Sözlük("English"));
		english.isValid();
		

		
//		Lambda Function
		
		Supplier<String> st = () -> "My first Supplier trial";
		
		System.out.println(st.get());
		
		
		
		Supplier<String> supplier= () -> "Furkan";
		
		System.out.println(supplier.get());
		
		Supplier<Sözlük> turkce2= ()-> new Sözlük("Türkçe");
		
		System.out.println(turkce2.get().toString());
		

		
		Supplier<String> dahaKısa= ()-> YazıAnaliziDependencyInjection.upuzunBayağıUzunBirMetodYazıyorumBirSüredir();
		
		System.out.println(dahaKısa.get().toUpperCase());
		
		
		
		

		double random= 100* Math.random();
		System.out.println(random);
		System.out.println(random);
		System.out.println(random);

		
		
		Supplier<Double> randomValue= () -> Math.random()*100;
		
		System.out.println(randomValue.get());
		System.out.println(randomValue.get());

		
		
		
		System.out.println("Bir " + random);
		System.out.println("iki " + 100* Math.random());
		System.out.println("üç " +randomValue.get());
		System.out.println("dört " +randomValue.get());
		
		randomValue.get();
		Math.random();
		
		
		
		Supplier<LocalDate> s1 = LocalDate::now;
		LocalDate s2 = LocalDate.now();
		
		System.out.println(s1.get()); //2016-10-25
		System.out.println(s2); //2016-10-25
		
		
		Supplier<LocalDate> d1= LocalDate::now;
		System.out.println(d1.get());
	}
	
}
