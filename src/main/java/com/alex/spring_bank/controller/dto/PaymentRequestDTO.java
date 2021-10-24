package com.alex.spring_bank.controller.dto;

import java.math.BigDecimal;

public class PaymentRequestDTO {

    private Long accId;

    private BigDecimal paymentAmount;

    public Long getAccId() {
        return accId;
    }

    public BigDecimal getPaymentAmount() {
        return paymentAmount;
    }
}
