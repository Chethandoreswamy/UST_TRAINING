package com.expenseTracker.Transaction.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Balancedto {

    public double income;
    public double expense;
    public double balance;
}
