package com.airtibe.java.payFlow.repository;

import com.airtibe.java.payFlow.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByUpiId(String upiId);
}
