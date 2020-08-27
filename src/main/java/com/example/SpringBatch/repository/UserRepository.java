package com.example.SpringBatch.repository;

import com.example.SpringBatch.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
