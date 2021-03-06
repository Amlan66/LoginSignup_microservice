package com.wellsfargo.stockmarket.loginsignup.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.wellsfargo.stockmarket.loginsignup.entity.User;



@Repository
public interface UserRepository extends JpaRepository <User, String> {
	
	//@Query("SELECT u.password from User u WHERE u.username='user1' ")
	 Optional<User> findById(String username);
		
}