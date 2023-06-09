package com.elbertribeiro.configuracao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.elbertribeiro")
public class SpringBootWeblogicApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootWeblogicApplication.class, args);
	}

}
