package com.expenseTracker.User.feign;

import com.expenseTracker.User.client.Transaction;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@FeignClient(name = "Transaction", url = "http://localhost:9091/api/v2/transaction")
public interface Transactionclient {

    @GetMapping("/monthTransaction/{userId}/{transactionType}/{month}/{year}")
    public ResponseEntity<List<Transaction>> getTransactionForMonth(@PathVariable long userId, @PathVariable String transactionType, @PathVariable int month, @PathVariable int year);

    @PostMapping("/addTransaction")
    public ResponseEntity<Transaction> createTranction(@RequestBody Transaction transaction);

}



