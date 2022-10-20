package com.sample.insurance.repository;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.stereotype.Repository;

import com.sample.insurance.model.Disapproved_pol;

@Repository
public interface DisapprovedPolRepository extends JpaRepositoryImplementation<Disapproved_pol, String>
{
    
}
