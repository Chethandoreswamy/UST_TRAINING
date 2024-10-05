package com.expenseTracker.Transaction.service;

import com.expenseTracker.Transaction.dto.Balancedto;
import com.expenseTracker.Transaction.model.Transaction;
import com.expenseTracker.Transaction.repository.TransactionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class TransactionService {

    @Autowired
    private TransactionRepo transactionRepo;

    public Transaction createTransaction(Transaction transaction) {
        return transactionRepo.save(transaction);
    }

    public Transaction deleteTransaction(String id) {
        Transaction transaction = transactionRepo.findById(id).orElse(null);
        if (transaction != null) {
            transactionRepo.delete(transaction);
            return transaction;
        }
        return null;
    }

    public List<Transaction> getTransactionByMonth(long userId,  String transactionType, int month, int year){
        return transactionRepo.findTransactionsByUserTypeMonthYear(userId, transactionType,month, year);
    }

    public Balancedto getBalanceByMonth(long userId, int month, int year){
        List<Object> result = transactionRepo.calculateIncomeExpenditureBalance(userId, month, year);

            double totalAmount = ((Number) result.get(2)).doubleValue(); // Cast to Number and convert to Double
            double income = ((Number) result.get(0)).doubleValue();
            double expense = ((Number) result.get(1)).doubleValue();


            return new Balancedto(income, expense, totalAmount);

    }

}
