package com.alex.spring_bank.controller.dto;

import java.math.BigDecimal;

public class DepositRequestDTO {

    private Long accId;

    private BigDecimal depositAmount;

    public Long getAccId() {
        return accId;
    }

    public BigDecimal getDepositAmount() {
        return depositAmount;
    }
}
