package com.expenseTracker.Transaction.dto;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Transactiondto {

    @Pattern(regexp = "^(CREDIT|DEBIT)$", message = "Transaction type must be either 'CREDIT' or 'DEBIT'")
    private String transactionType;
    private String transactionCategory;

    @NotNull(message = "amount should not be empty")
    private double transactionAmount;
    private String transactionDescription;
}
