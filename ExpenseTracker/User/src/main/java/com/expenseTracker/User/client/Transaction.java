package com.expenseTracker.User.client;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CurrentTimestamp;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
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
