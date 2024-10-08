package com.expenseTracker.User.controller;

import com.expenseTracker.User.client.Transaction;
import com.expenseTracker.User.model.User;
import com.expenseTracker.User.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/home")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/addUser")
    public ResponseEntity<User> addUser(@RequestBody User user){
        return ResponseEntity.ok(userService.addUser(user));
    }

    @PostMapping("/addTransaction")
    public ResponseEntity<Transaction> addTranscation(@RequestBody Transaction transaction){
        return ResponseEntity.ok(userService.addTransaction(transaction));
    }

    @GetMapping("/monthTransaction/{userId}/{transactionType}/{month}/{year}")
    public ResponseEntity<List<Transaction>> getTranscation(@PathVariable Long userId, @PathVariable String transactionType, @PathVariable int month, @PathVariable int year){
        return ResponseEntity.ok(userService.getTransactionByMonth(userId,transactionType,month, year));
    }
}
