package com.cts.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.bean.Loan;
import com.cts.repository.LoanRepository;

@Service
public class LoanService {
	@Autowired
	LoanRepository repo;
	
	public Optional<Loan> getLoanById(Long loanNumber) {
		return repo.findByloanNumber(loanNumber);
	}


}
