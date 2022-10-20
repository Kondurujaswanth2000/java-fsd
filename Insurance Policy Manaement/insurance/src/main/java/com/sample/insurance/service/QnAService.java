package com.sample.insurance.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sample.insurance.model.QnA;
import com.sample.insurance.repository.QnARepository;

@Service
public class QnAService 
{
    @Autowired
    QnARepository qnaRepo;

    @Transactional
	public List<QnA> fetchQueries() 
    {
		List<QnA> queriesList=qnaRepo.findAll();
		return queriesList;	
	}

	@Transactional
	public QnA saveQuery(QnA queries) 
    {	
		return qnaRepo.save(queries);	
	}

	@Transactional
	public void updateQuery(QnA queries) 
    {
		qnaRepo.save(queries);	
	}
	
	@Transactional
	public void deleteQuery(String userName) 
    {
		qnaRepo.deleteById(userName);
	}

	@Transactional 
    public QnA getQuery(String userName) 
    { 
        Optional<QnA> optional= qnaRepo.findById(userName);
        QnA queries=optional.get();
        return queries;
    }
}
