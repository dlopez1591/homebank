package com.daniellopez.homebank;

import com.daniellopez.homebank.models.Client;
import com.daniellopez.homebank.repositories.ClientRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class HomebankApplication {

	public static void main(String[] args) {
		SpringApplication.run(HomebankApplication.class, args);
	}
	@Bean
	public CommandLineRunner initData(ClientRepository clientRepository){
		return (args) -> {

		}
	}

}
