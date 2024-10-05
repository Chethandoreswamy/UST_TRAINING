package com.expenseTracker.Transaction.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.expenseTracker.Transaction.model.Transaction;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface TransactionRepo extends JpaRepository<Transaction, String>{

    @Query("SELECT o FROM Transaction o WHERE o.userId = :userId AND o.transactionType = :type AND MONTH(o.transactionDate) = :month AND YEAR(o.transactionDate) = :year")
    List<Transaction> findTransactionsByUserTypeMonthYear(@Param("userId") Long userId, @Param("type") String type, @Param("month") int month, @Param("year") int year);

    @Query("SELECT " + "SUM(CASE WHEN t.transactionType = 'CREDIT' THEN t.transactionAmount ELSE 0 END) as income, " + "SUM(CASE WHEN t.transactionType = 'DEBIT' THEN t.transactionAmount ELSE 0 END) as expenditure, " + "(SUM(CASE WHEN t.transactionType = 'CREDIT' THEN t.transactionAmount ELSE 0 END) - " + " SUM(CASE WHEN t.transactionType = 'DEBIT' THEN t.transactionAmount ELSE 0 END)) as totalBalance " + "FROM Transaction t " + "WHERE t.userId = :uid AND MONTH(t.transactionDate) = :month AND YEAR(t.transactionDate) = :year")
    List<Object> calculateIncomeExpenditureBalance(@Param("uid") Long uid,  @Param("month") int month,@Param("year") int year);
}


