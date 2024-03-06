package com.desafiopicpay.desafiopicpay.repositories;

import com.desafiopicpay.desafiopicpay.data.models.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface TransactionRepository extends JpaRepository<Transaction, UUID> {
}
