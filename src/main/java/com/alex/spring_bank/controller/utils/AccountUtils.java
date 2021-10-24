package com.alex.spring_bank.controller.utils;

import com.alex.spring_bank.entity.Account;
import com.alex.spring_bank.entity.Bill;
import com.alex.spring_bank.exceptions.NotDefaultBillException;

public class AccountUtils {
    public static Bill findDefaultBill(Account account) {
        return account.getBills().stream().filter(Bill::getDefault).findAny()
                .orElseThrow(() -> new NotDefaultBillException("Unable to find default bill for account with id: " + account.getId()));
    }
}
