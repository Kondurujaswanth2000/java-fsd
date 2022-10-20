package com.sample.insurance.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sample.insurance.model.Policies;
import com.sample.insurance.repository.PoliciesRepository;

@Service
public class PoliciesService 
{
    @Autowired
    PoliciesRepository polRepo;

    @Transactional
	public List<Policies> fetchPolicies() 
    {
		List<Policies> list=polRepo.findAll();
		return list;		
	}

	/*@Transactional
	public Policies savePolicy(Policies policies) 
    {	
		return polRepo.save(policies);	
	}*/

	@Transactional
	public String savePolicy(Policies policies)
	{
		if(polRepo.existsById(policies.getPolicyId()))
		{
			return "Id should be unique!";
		}
		else
		{
			polRepo.save(policies);
			return "Details added successfully!";
		}
	}

	/*@Transactional
	public Policies updatePolicy(Policies policies) 
    {
		polRepo.save(policies);	
		return (policies);
	}
	
	@Transactional
	public void deletePolicy(int policyId) 
    {
		polRepo.deleteById(policyId);
	}*/

	@Transactional
	public String deletePolicy(int policyId)
	{
		if(!polRepo.existsById(policyId))
		{
			return "Policy details not present!";
		}
		else
		{
			polRepo.deleteById(policyId);
			return "Policy details deleted successfully!";
		}
	}

	@Transactional
	public String updatePolicyy(Policies polici)
	{
		if(polRepo.existsById(polici.getPolicyId()))
		{
			Policies p = polRepo.getReferenceById(polici.getPolicyId());
			p.setPolicyName(polici.getPolicyName());
			p.setAmount(polici.getAmount());
			p.setTenureInYears(polici.getTenureInYears());
			p.setCategory(polici.getCategory());
			polRepo.saveAndFlush(p);
			return "Policy details updated succcessfully!";
		}
		else
		{
			return "No policy Id was found!";
		}
	} 

	@Transactional 
    public Policies getPolicy(int policyId) 
    { 
        Optional<Policies> optional = polRepo.findById(policyId);
        Policies policies = optional.get();
        return policies;	  
    }
}
