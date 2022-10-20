package com.sample.insurance.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.sample.insurance.model.User_login;

public interface UserLoginRepository extends JpaRepository<User_login, String>
{
    @Query("SELECT dl FROM User_login dl WHERE dl.userName =?1 and dl.password=?2")
	public User_login validateLogin(String userName,String password);
}
