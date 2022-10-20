package com.sample.insurance.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sample.insurance.model.Pol_Category;

@Repository
public interface PolCategoryRepository extends JpaRepository<Pol_Category, String>
{
    
}
