package com.alex.spring_bank.controller.dto;

import java.math.BigDecimal;

public class TransferRequestDTO {

    private Long accIdFrom;

    private Long accIdTo;

    private BigDecimal amount;

    public Long getAccIdFrom() {
        return accIdFrom;
    }

    public Long getAccIdTo() {
        return accIdTo;
    }

    public BigDecimal getAmount() {
        return amount;
    }

}
