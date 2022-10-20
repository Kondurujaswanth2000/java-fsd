package com.sample.insurance.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sample.insurance.model.User_register;

@Repository
public interface UserRegisterRepository extends JpaRepository<User_register, String>
{
    
}
