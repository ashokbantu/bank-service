package com.ashok.entity;


import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name = "ACCOUNT")
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long accountId;

    @Column(nullable = false)
    private String accountHolderName;

    @Column(nullable = false, unique = true)
    private String accountNumber;

    @Column(nullable = false)
    private String accountType;

    @Column(nullable = false)
    private BigDecimal balance;

    @Column(nullable = false)
    private String status;


    public Account() {
    }


    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }


    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(
            String accountHolderName) {

        this.accountHolderName =
                accountHolderName;
    }


    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(
            String accountNumber) {

        this.accountNumber =
                accountNumber;
    }


    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(
            String accountType) {

        this.accountType =
                accountType;
    }


    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(
            BigDecimal balance) {

        this.balance =
                balance;
    }


    public String getStatus() {
        return status;
    }

    public void setStatus(
            String status) {

        this.status =
                status;
    }
}
