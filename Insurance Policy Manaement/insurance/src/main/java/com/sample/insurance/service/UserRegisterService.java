package com.sample.insurance.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sample.insurance.model.User_register;
import com.sample.insurance.repository.UserRegisterRepository;

@Service
public class UserRegisterService 
{
    @Autowired
    UserRegisterRepository userRegRepo;

    @Transactional
	public List<User_register> fetchUser() 
    {
		List<User_register> userList = userRegRepo.findAll();
		return userList;
	}

	@Transactional
	public User_register saveUser(User_register user) 
    {
		return userRegRepo.save(user);
	}

	@Transactional
	public User_register updateUser(User_register user) 
    {
		userRegRepo.save(user);
		return user; 
	}

	@Transactional
	public void deleteUser(String userName) 
    {
		userRegRepo.deleteById(userName);
	}

	@Transactional
	public User_register getUser(String userName) 
    {
		Optional<User_register> optional = userRegRepo.findById(userName);
		User_register user = optional.get();
		return user;
	}
}
