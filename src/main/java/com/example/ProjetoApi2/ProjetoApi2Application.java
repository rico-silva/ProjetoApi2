package com.example.ProjetoApi2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class ProjetoApi2Application {

	public static void main(String[] args) {
		SpringApplication.run(ProjetoApi2Application.class, args);
	}

}
