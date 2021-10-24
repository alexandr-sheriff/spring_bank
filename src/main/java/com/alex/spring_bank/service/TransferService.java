package com.alex.spring_bank.service;

import com.alex.spring_bank.controller.utils.AccountUtils;
import com.alex.spring_bank.entity.Account;
import com.alex.spring_bank.entity.Bill;
import com.alex.spring_bank.exceptions.NotDefaultBillException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class TransferService {

    private final AccountService accountService;

    @Autowired
    public TransferService(AccountService accountService) {
        this.accountService = accountService;
    }

    public Object transfer(Long accIdFrom, Long accIdTo, BigDecimal amount) {
        Account accFrom = accountService.getById(accIdFrom);
        Account accTo = accountService.getById(accIdTo);
        Bill billFrom = AccountUtils.findDefaultBill(accFrom);
        Bill billTo = AccountUtils.findDefaultBill(accTo);
        billFrom.setAmount(billFrom.getAmount().subtract(amount));
        billTo.setAmount(billTo.getAmount().add(amount));
        accountService.update(accFrom);
        accountService.update(accTo);
        return "Success";
    }

}
