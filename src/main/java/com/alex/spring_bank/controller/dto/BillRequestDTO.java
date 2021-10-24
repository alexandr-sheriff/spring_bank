package com.alex.spring_bank.controller.dto;

import com.alex.spring_bank.entity.Bill;

import java.math.BigDecimal;

public class BillRequestDTO {

    private BigDecimal amount;

    private Boolean isDefault;

    public BigDecimal getAmount() {
        return amount;
    }

    public Boolean getIsDefault() {
        return isDefault;
    }
}
