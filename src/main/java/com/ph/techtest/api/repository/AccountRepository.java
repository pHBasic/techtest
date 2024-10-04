package com.ph.techtest.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ph.techtest.api.model.Account;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long> {
        
}
