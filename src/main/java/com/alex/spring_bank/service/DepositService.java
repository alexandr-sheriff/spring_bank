package com.alex.spring_bank.service;

import com.alex.spring_bank.controller.utils.AccountUtils;
import com.alex.spring_bank.entity.Account;
import com.alex.spring_bank.entity.Bill;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class DepositService {

    private final AccountService accountService;

    @Autowired
    public DepositService(AccountService accountService) {
        this.accountService = accountService;
    }

    public Object deposit(Long accId, BigDecimal depositAmount) {
        if (depositAmount.compareTo(BigDecimal.valueOf(0)) > 0) {
            Account account = accountService.getById(accId);
            Bill defaultBill = AccountUtils.findDefaultBill(account);
            defaultBill.setAmount(defaultBill.getAmount().add(depositAmount));
            accountService.update(account);
            return "Success";
        } else {
            return "Amount must be gt that 0";
        }
    }
}
