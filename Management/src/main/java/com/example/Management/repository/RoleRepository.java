package com.example.Management.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Management.model.Role;




@Repository
public interface RoleRepository extends JpaRepository<Role, Integer>{

	Role findByRole(String name);
}
