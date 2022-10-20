package com.sample.insurance.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sample.insurance.model.AuthS;
import com.sample.insurance.model.User_login;
import com.sample.insurance.repository.UserLoginRepository;

@Service
public class UserLoginService 
{
    @Autowired
    UserLoginRepository userLoginRepo;

    public AuthS validateLogin(String userName, String password)
    {
		AuthS status = null;
		User_login login = userLoginRepo.validateLogin(userName, password);
		System.out.println(login);

		if(login!=null) 
        {
			status = new AuthS(login.getUserName(), login.getPassword(), true);
		}
		else 
        {
			status = new AuthS(null, null, false);
		}
		return status;
	}
}
