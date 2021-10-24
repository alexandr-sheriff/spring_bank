package com.alex.spring_bank.controller.dto;

import com.alex.spring_bank.entity.Account;
import com.alex.spring_bank.entity.Bill;

import java.util.List;
import java.util.stream.Collectors;

public class AccountResponseDTO {

    private Long id;

    private String name;

    private String email;

    private List<BillResponseDTO> bills;

    public AccountResponseDTO(Account account) {
        id = account.getId();
        name = account.getName();
        email = account.getEmail();
        bills = account.getBills().stream().map(BillResponseDTO::new).collect(Collectors.toList());
    }

    public AccountResponseDTO(Long id, String name, String email, List<BillResponseDTO> bills) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.bills = bills;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<BillResponseDTO> getBills() {
        return bills;
    }

    public void setBills(List<BillResponseDTO> bills) {
        this.bills = bills;
    }
}
