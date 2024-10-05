package com.expenseTracker.Transaction.controller;

import com.expenseTracker.Transaction.dto.Balancedto;
import com.expenseTracker.Transaction.model.Transaction;
import com.expenseTracker.Transaction.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/transaction")
public class TransactionController {

    @Autowired
    private TransactionService transactionService;

    @PostMapping("/addTransaction")
    public ResponseEntity<Transaction> createTranction(@RequestBody Transaction transaction){
        return new ResponseEntity<>(transactionService.createTransaction(transaction), HttpStatus.CREATED);
    }

    @GetMapping("/monthTransaction/{userId}/{transactionType}/{month}/{year}")
    public ResponseEntity<List<Transaction>> getTransactionForMonth(@PathVariable long userId, @PathVariable String transactionType, @PathVariable int month, @PathVariable int year){
        return ResponseEntity.ok(transactionService.getTransactionByMonth(userId, transactionType, month, year));
    }

    @GetMapping("/BalanceOfMonth/{userId}/{month}/{year}")
    public ResponseEntity<Balancedto> getBalanceOfMonth(@PathVariable long userId, @PathVariable int month, @PathVariable int year){
        return ResponseEntity.ok(transactionService.getBalanceByMonth(userId,month,year));
    }
}
