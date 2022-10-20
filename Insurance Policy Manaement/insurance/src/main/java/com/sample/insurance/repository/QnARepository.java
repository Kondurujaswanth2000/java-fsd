package com.sample.insurance.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sample.insurance.model.QnA;

@Repository
public interface QnARepository extends JpaRepository<QnA, String>
{
    
}
