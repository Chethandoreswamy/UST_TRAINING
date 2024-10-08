package com.expenseTracker.User.service;

import com.expenseTracker.User.client.Transaction;
import com.expenseTracker.User.feign.Transactionclient;
import com.expenseTracker.User.model.User;
import com.expenseTracker.User.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private Transactionclient transactionclient;

    public User addUser(User user){
        return userRepository.save(user);
    }

    public Transaction addTransaction(Transaction transaction){
        return transactionclient.createTranction(transaction).getBody();
    }

    public List<Transaction> getTransactionByMonth(long userId, String transactiontype, int month, int year){
        return transactionclient.getTransactionForMonth(userId, transactiontype,month, year).getBody();
    }
}
