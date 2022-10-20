package com.sample.insurance.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sample.insurance.model.Pol_Category;
import com.sample.insurance.repository.PolCategoryRepository;

@Service
public class PolCategoryService 
{
    @Autowired
    PolCategoryRepository polcatRepo;

    @Transactional
	public List<Pol_Category> fetchCategory() 
    {
		List<Pol_Category> list = polcatRepo.findAll();
		return list;
	}

	@Transactional
	public Pol_Category SaveCategory(Pol_Category category) 
    {
		return polcatRepo.save(category);
	}
	
	@Transactional
	public String deleteCategory(String category) 
    {
		polcatRepo.deleteById(category);
		return "deleted";
	}

	@Transactional
	public Pol_Category getCategory(String Category) 
    {
		Optional<Pol_Category> optional = polcatRepo.findById(Category);
		Pol_Category insuranceCategory = optional.get();
		return insuranceCategory;

	}
}
