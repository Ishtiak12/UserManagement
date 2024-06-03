package com.example.Management.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Management.model.User;



@Repository
public interface UserRepository extends JpaRepository<User, Integer>{

	User findByEmail(String emailId);
}