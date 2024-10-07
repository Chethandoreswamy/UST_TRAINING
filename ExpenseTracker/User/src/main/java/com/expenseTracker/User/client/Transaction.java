package com.expenseTracker.User.client;

import org.hibernate.annotations.CurrentTimestamp;

import java.util.Date;

public class Transaction {
    private String transactionId;

    private String transactionType;
    private String transactionCategory;
    private double transactionAmount;
    @CurrentTimestamp
    private Date transactionDate;
    private String transactionDescription;
    private long userId;

}
