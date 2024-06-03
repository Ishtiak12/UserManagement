package com.example.Management.service;


import org.springframework.security.core.userdetails.UserDetailsService;

import com.example.Management.DTO.UserRegisteredDTO;
import com.example.Management.model.User;




public interface DefaultUserService extends UserDetailsService{

	User save(UserRegisteredDTO userRegisteredDTO);
	
}