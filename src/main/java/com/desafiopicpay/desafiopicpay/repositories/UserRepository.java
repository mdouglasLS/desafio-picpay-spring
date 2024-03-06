package com.desafiopicpay.desafiopicpay.repositories;

import com.desafiopicpay.desafiopicpay.data.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface UserRepository extends JpaRepository<User, UUID> {
}
