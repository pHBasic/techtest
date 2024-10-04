package com.ph.techtest.api.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ph.techtest.api.model.Account;
import com.ph.techtest.api.repository.AccountRepository;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/accounts")
@AllArgsConstructor
public class AccountController {

    private final AccountRepository accountRepository;

    @GetMapping
    public List<Account> list(){
        return accountRepository.findAll();
    }

}
