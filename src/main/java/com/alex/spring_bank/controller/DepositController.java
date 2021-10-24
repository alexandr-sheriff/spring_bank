package com.alex.spring_bank.controller;

import com.alex.spring_bank.controller.dto.DepositRequestDTO;
import com.alex.spring_bank.controller.dto.PaymentRequestDTO;
import com.alex.spring_bank.service.DepositService;
import com.alex.spring_bank.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DepositController {

    private final DepositService depositService;

    @Autowired
    public DepositController(DepositService depositService) {
        this.depositService = depositService;
    }

    @PostMapping("/deposits")
    public Object pay(@RequestBody DepositRequestDTO depositRequestDTO) {
        return depositService.deposit(depositRequestDTO.getAccId(), depositRequestDTO.getDepositAmount());
    }
}
