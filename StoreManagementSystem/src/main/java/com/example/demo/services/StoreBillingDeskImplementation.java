package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.StoreBillingDesk;
import com.example.demo.repository.StoreBillingDeskRepository;

@Service
public class StoreBillingDeskImplementation implements StoreBillingDeskServices {
	
	@Autowired
	private StoreBillingDeskRepository storeBillingDeskRepository;
	
	@Override
	public List<StoreBillingDesk> getProducts(){
		return storeBillingDeskRepository.findAll();
	}

	@Override
	public Optional<StoreBillingDesk> getProduct(int customer_id) {
		System.out.println("Inside");
		Optional<StoreBillingDesk> optionaldata=storeBillingDeskRepository.findById(customer_id);
		return optionaldata;
	}

	@Override
	public StoreBillingDesk addProducts(StoreBillingDesk storeBillingDesk) {
		
		return storeBillingDeskRepository.save(storeBillingDesk);
	}

	@Override
	public StoreBillingDesk updateProducts(StoreBillingDesk storeBillingDesk) {
		
		return storeBillingDeskRepository.save(storeBillingDesk);
	}

	@Override
	public void deleteProducts(int customer_id) {
		storeBillingDeskRepository.deleteById(customer_id);
	}
	}
	
    