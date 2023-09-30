package com.daniellopez.homebank;

import com.daniellopez.homebank.models.Account;
import com.daniellopez.homebank.models.Client;
import com.daniellopez.homebank.repositories.AccountRepository;
import com.daniellopez.homebank.repositories.ClientRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDateTime;

@SpringBootApplication
public class HomebankApplication {

	public static void main(String[] args) {
		SpringApplication.run(HomebankApplication.class, args);
	}
	@Bean
	public CommandLineRunner initData(ClientRepository clientRepository, AccountRepository accountRepository){
		return (args) -> {
			Client daniel = new Client("Daniel", "Lopez", "dlopez1591@gmail.com");
			Client melba = new Client("Melba","Morel","melba@mindhub.com");

			Account vin001 = new Account("vin001", LocalDateTime.now(),5000);
			Account vin002 = new Account("vin002",LocalDateTime.now().plusDays(1),7500);

			daniel.addAccount(vin001);
			melba.addAccount(vin002);

			clientRepository.save(daniel);
			clientRepository.save(melba);

			accountRepository.save(vin001);
			accountRepository.save(vin002);
		};
	}

}
