package com.cts.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.cts.bean.Loan;

public interface LoanRepository extends CrudRepository<Loan,Long>{
    Optional<Loan> findByloanNumber(Long loanNumber);


}
