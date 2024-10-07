package com.expenseTracker.Transaction.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;

import lombok.Data;

import lombok.NoArgsConstructor;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String transactionId;

    private String transactionType;
    private String transactionCategory;
    private double transactionAmount;
    private String transactionDescription;
    private Long userId;
    private Timestamp transactionDate;

    // Example method to extract the month from java.util.Date
}
