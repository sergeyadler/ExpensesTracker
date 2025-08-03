package com.expensetacker.expense_tracker.repository;

import com.expensetacker.expense_tracker.model.Expense;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface ExpensesRepository extends JpaRepository<Expense,Long> {
    List<Expense> findByUserId(Long userId);
    List<Expense> findByUserIdAndDateBetween(Long userId, LocalDate from , LocalDate to);
}
