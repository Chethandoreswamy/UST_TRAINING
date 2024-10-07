package com.expenseTracker.Transaction.service;

import com.expenseTracker.Transaction.dto.Balancedto;
import com.expenseTracker.Transaction.model.Transaction;
import com.expenseTracker.Transaction.repository.TransactionRepo;
import com.speedment.jpastreamer.application.JPAStreamer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;



@Service
public class TransactionService {

    @Autowired
    private TransactionRepo transactionRepo;

    private final JPAStreamer jpaStreamer;

    @Autowired
    public TransactionService(final JPAStreamer jpaStreamer) {
        this.jpaStreamer = jpaStreamer;
    }

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

    public List<Transaction> getTransactionByMonth(long userId,  String transactionType, int month, int year) {
        List<Transaction> transactions = jpaStreamer.stream(Transaction.class)
                .filter(transaction -> transaction.getUserId() == userId)            // Filter by userId
                .filter(transaction -> transaction.getTransactionType().equals(transactionType))     // Filter by transactionType
                .filter(transaction -> transaction.getTransactionDate().toLocalDateTime().getMonthValue() == month)  // Filter by month
                .filter(transaction -> transaction.getTransactionDate().toLocalDateTime().getYear() == year) // Filter by year
                .collect(Collectors.toList());

        return transactions;
    }

public Balancedto getBalanceByMonth(Long uid, int month, int year) {

    Balancedto obj = jpaStreamer.stream(Transaction.class)
            .filter(transaction -> transaction.getUserId() == uid)
            .filter(transaction -> transaction.getTransactionDate().toLocalDateTime().getMonthValue() == month)
            .filter(transaction -> transaction.getTransactionDate().toLocalDateTime().getYear() == year)
            .collect(Collectors.teeing(
            Collectors.summingDouble(transaction -> "CREDIT".equals(transaction.getTransactionType()) ? transaction.getTransactionAmount() : 0),
            Collectors.summingDouble(transaction -> "DEBIT".equals(transaction.getTransactionType()) ? transaction.getTransactionAmount() : 0),
            (income, expense) -> new Balancedto(income, expense, income - expense)));

    return obj;
}

public Map<String, Double> getExpenseByCategorey(long userId, String category){
        Double obj = jpaStreamer.stream(Transaction.class)
                .filter(transaction -> transaction.getUserId().equals(userId))
                .filter(transaction -> transaction.getTransactionCategory().equalsIgnoreCase(category))
                .collect(Collectors.summingDouble(transaction -> transaction.getTransactionAmount()));

    Map<String, Double> m = new HashMap<>();
    m.put(category,obj);
        return m;
}


}
