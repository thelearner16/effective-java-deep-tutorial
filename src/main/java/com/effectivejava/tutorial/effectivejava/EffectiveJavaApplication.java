package com.effectivejava.tutorial.effectivejava;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.effectivejava.tutorial.effectivejava.item7.Stack;

@SpringBootApplication
public class EffectiveJavaApplication {

	public static void main(String[] args) {
		SpringApplication app= new SpringApplication(EffectiveJavaApplication.class);
		
		Map<String, Object> props = new HashMap<>();
        props.put("server.port", "8081");
//        props.put("server.error.whitelabel.enabled", "false");
        
        app.setDefaultProperties(props);

		
		
		app.run(args);
	
	}

}
