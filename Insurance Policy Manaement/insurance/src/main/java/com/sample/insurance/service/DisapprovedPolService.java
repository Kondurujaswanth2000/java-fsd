package com.sample.insurance.service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sample.insurance.model.Disapproved_pol;
import com.sample.insurance.repository.DisapprovedPolRepository;

@Service
public class DisapprovedPolService 
{
    @Autowired
    DisapprovedPolRepository disApprovedPolRepo;

    public List<Disapproved_pol> getAllDisapproved() 
    {
		return disApprovedPolRepo.findAll();
	}

	public Optional<Disapproved_pol> getDisapproved(String userName) 
    {
		return disApprovedPolRepo.findById(userName);
	}

	public String addDisapproved(Disapproved_pol disapproved) 
    {
	    Date date=new Date();
		String status="disapproved";
		disapproved.setDate(date);
		disapproved.setStatus(status);
		disApprovedPolRepo.save(disapproved);
		return "added";
	}
}
