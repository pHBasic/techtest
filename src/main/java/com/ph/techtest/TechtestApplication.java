package com.ph.techtest;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.ph.techtest.api.enums.AccountType;
import com.ph.techtest.api.model.Account;
import com.ph.techtest.api.repository.AccountRepository;

@SpringBootApplication
public class TechtestApplication {

    public static void main(String[] args) {
        SpringApplication.run(TechtestApplication.class, args);
    }

    @Bean
    CommandLineRunner initDatabase(AccountRepository accountRepository){
        return args -> {
            accountRepository.deleteAll();

            Account a = new Account();
                a.setName("pedro");
                a.setAccountType(AccountType.CORRENTE);

            accountRepository.save(a);
        };
    }
}
