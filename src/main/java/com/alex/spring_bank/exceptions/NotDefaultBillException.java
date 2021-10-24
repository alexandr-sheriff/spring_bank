package com.alex.spring_bank.exceptions;

public class NotDefaultBillException extends RuntimeException{
    public NotDefaultBillException(String message) {
        super(message);
    }
}
