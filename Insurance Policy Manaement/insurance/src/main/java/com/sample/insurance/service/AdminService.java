package com.sample.insurance.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sample.insurance.model.Admin_table;
import com.sample.insurance.model.AuthS;
import com.sample.insurance.repository.AdminRepository;

@Service
public class AdminService 
{
    @Autowired
	AdminRepository adminRepository;

    public AuthS validateAdminLogin(String username, String password) 
    {
		AuthS status = null;
		Admin_table admin = adminRepository.validateAdmin(username, password);
		if(admin!=null) 
        {
			status = new AuthS(admin.getUsername(), admin.getPassword(), true);
		}
		else 
        {
			status = new AuthS(null, null, false);
		}
		return status;
	}
}
