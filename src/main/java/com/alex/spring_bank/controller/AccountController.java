package com.alex.spring_bank.controller;

import com.alex.spring_bank.controller.dto.AccountRequestDTO;
import com.alex.spring_bank.controller.dto.AccountResponseDTO;
import com.alex.spring_bank.entity.Account;
import com.alex.spring_bank.entity.Bill;
import com.alex.spring_bank.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.stream.Collectors;

@RestController
public class AccountController {

    private final AccountService accountService;

    @Autowired
    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }

    @GetMapping("/accounts")
    public AccountResponseDTO getById(
            @PathVariable Long accId
    ) {
        return new AccountResponseDTO(accountService.getById(accId));
    }

    @PostMapping("/accounts")
    public Long create(
            @RequestBody AccountRequestDTO accountRequestDTO
            ) {
        return accountService.save(
                accountRequestDTO.getName(),
                accountRequestDTO.getEmail(),
                accountRequestDTO.getBills().stream().map(Bill::new).collect(Collectors.toList()));
    }

}
