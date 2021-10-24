package com.alex.spring_bank.service;

import com.alex.spring_bank.entity.Account;
import com.alex.spring_bank.entity.Bill;
import com.alex.spring_bank.exceptions.AccountNotFoundException;
import com.alex.spring_bank.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountService {

    private final AccountRepository accountRepository;

    @Autowired
    public AccountService(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    public Long save(String name, String email, List<Bill> bills) {
        Account account = new Account(name, email, bills);
        return accountRepository.save(account).getId();
    }

    public Account getById(Long accId) {
        return accountRepository.findById(accId)
                .orElseThrow(() -> new AccountNotFoundException("Unable to find account with id " + accId));
    }

    public Account update(Account account) {
        return accountRepository.save(account);
    }
}
