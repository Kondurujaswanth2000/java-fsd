package com.sample.insurance.repository;
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.stereotype.Repository;

import com.sample.insurance.model.Approved_pol;


@Repository
public interface ApprovedPolRepository extends JpaRepositoryImplementation<Approved_pol, String>
{
    
}
