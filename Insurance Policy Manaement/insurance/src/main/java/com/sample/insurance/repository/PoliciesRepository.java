package com.sample.insurance.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sample.insurance.model.Policies;

@Repository
public interface PoliciesRepository extends JpaRepository<Policies, Integer>
{
    
} 
