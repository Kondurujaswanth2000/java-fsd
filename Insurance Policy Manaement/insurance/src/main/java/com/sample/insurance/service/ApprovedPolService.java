package com.sample.insurance.service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sample.insurance.model.Approved_pol;
import com.sample.insurance.repository.ApprovedPolRepository;

@Service
public class ApprovedPolService 
{
    @Autowired
    ApprovedPolRepository approvedpolRepo;

    public List<Approved_pol> getAllApproved() 
    {
		return approvedpolRepo.findAll();
	}

	public Optional<Approved_pol> getApproved(String userName) 
    {
		return approvedpolRepo.findById(userName);
	}

	public String addApproved(Approved_pol approved) 
    {
        Date date=new Date();
        String status="approved";
        approved.setDate(date);
        approved.setStatus(status);
        approvedpolRepo.save(approved);
		return "added";
	}
}
