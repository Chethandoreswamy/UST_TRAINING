package com.expenseTracker.Transaction.repository;

import com.expenseTracker.Transaction.dto.Balancedto;
import com.expenseTracker.Transaction.dto.Transactiondto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.expenseTracker.Transaction.model.Transaction;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.speedment.jpastreamer.application.JPAStreamer;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Repository
public interface TransactionRepo extends JpaRepository<Transaction, String>{

//    @Query("SELECT o FROM Transaction o WHERE o.userId = :userId AND o.transactionType = :type AND MONTH(o.transactionDate) = :month AND YEAR(o.transactionDate) = :year")
//    List<Transaction> findTransactionsByUserTypeMonthYear(@Param("userId") Long userId, @Param("type") String type, @Param("month") int month, @Param("year") int year);

//    @Query("SELECT SUM(CASE WHEN t.transactionType = 'CREDIT' THEN t.transactionAmount ELSE 0 END) as income, SUM(CASE WHEN t.transactionType = 'DEBIT' THEN t.transactionAmount ELSE 0 END) as expense, (SUM(CASE WHEN t.transactionType = 'CREDIT' THEN t.transactionAmount ELSE 0 END) -  SUM(CASE WHEN t.transactionType = 'DEBIT' THEN t.transactionAmount ELSE 0 END)) as balance FROM Transaction t WHERE t.userId = :uid AND MONTH(t.transactionDate) = :month AND YEAR(t.transactionDate) = :year")
//    Balancedto calculateIncomeExpenditureBalance(@Param("uid") Long uid,  @Param("month") int month,@Param("year") int year);





//    @Query(value = "SELECT " +
//            "SUM(CASE WHEN t.transaction_type = 'CREDIT' THEN t.transaction_amount ELSE 0 END) as income, " +
//            "SUM(CASE WHEN t.transaction_type = 'DEBIT' THEN t.transaction_amount ELSE 0 END) as expenses, " +
//            "(SUM(CASE WHEN t.transaction_type = 'CREDIT' THEN t.transaction_amount ELSE 0 END) - " +
//            "SUM(CASE WHEN t.transaction_type = 'DEBIT' THEN t.transaction_amount ELSE 0 END)) as balance " +
//            "FROM transaction t " +
//            "WHERE t.user_id = :uid AND MONTH(t.transaction_date) = :month AND YEAR(t.transaction_date) = :year",
//            nativeQuery = true)
//    List<Object[]> calculateIncomeExpenditureBalanceNative(@Param("uid") Long uid, @Param("month") int month, @Param("year") int year);


}


