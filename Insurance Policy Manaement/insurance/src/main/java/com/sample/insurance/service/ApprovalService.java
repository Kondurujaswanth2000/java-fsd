package com.sample.insurance.service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sample.insurance.model.Approval;
import com.sample.insurance.repository.ApprovalRepository;

@Service
public class ApprovalService 
{
    @Autowired
    ApprovalRepository approvalRepo;

    public List<Approval> getAllApprovals() 
    {
		return approvalRepo.findAll();
	}

	public Optional<Approval> getApprovals(String userName) 
    {
		return approvalRepo.findById(userName);
	}

	public void addApproval(Approval approvals) 
    {
		Date date = new Date();
        approvals.setDate(date);
        String status="Pending";
		approvals.setStatus(status);
		approvalRepo.save(approvals);	
	}

	public void deleteApproval(String userName) 
    {
		approvalRepo.deleteById(userName);
	}
}
