package com.example.POC.repository;

import com.example.POC.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;



public interface UserRepository extends JpaRepository<User, Integer> {
}
