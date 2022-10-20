package com.sample.insurance.repository;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.stereotype.Repository;

import com.sample.insurance.model.Approval;

@Repository
public interface ApprovalRepository extends JpaRepositoryImplementation<Approval, String>
{
    
}
