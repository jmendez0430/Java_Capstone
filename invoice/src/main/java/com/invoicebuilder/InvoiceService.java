package com.invoicebuilder;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;


@Service
public class InvoiceService {
	
	@Autowired
	private JobRepository repo;

	public List<Job> listAll() {
		
	return repo.findAll();
	}
	
	public void save(Job job) {
		repo.save(job);
	}
	
	public Job get(Long code) {
		return repo.findById(code).get();
	}
	
	public void delete(Long code) {
		repo.deleteById(code);
	}
}
