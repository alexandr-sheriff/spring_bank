package com.alex.spring_bank.controller.dto;

import com.alex.spring_bank.entity.Account;

import java.util.List;
import java.util.stream.Collectors;

public class AccountRequestDTO {

    private String name;

    private String email;

    private List<BillRequestDTO> bills;

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public List<BillRequestDTO> getBills() {
        return bills;
    }

}
