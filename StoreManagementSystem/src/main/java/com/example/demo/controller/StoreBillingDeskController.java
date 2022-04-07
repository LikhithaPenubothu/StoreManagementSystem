package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.model.StoreBillingDesk;
import com.example.demo.services.StoreBillingDeskImplementation;

public class StoreBillingDeskController {
	
	@Autowired
	private StoreBillingDeskImplementation storeBillingDeskService;
	
	@GetMapping("/StoreBillingDesk")
	public List<StoreBillingDesk> getProducts() {
		return storeBillingDeskService.getProducts();
	}
	@GetMapping("/StoreBillingDesk/{customer_id}")
	public Optional<StoreBillingDesk> getProduct(@PathVariable int customer_id) {
		return storeBillingDeskService.getProduct(customer_id);
	}
	@PostMapping("/StoreBillingDesk")
	public StoreBillingDesk addProducts(@RequestBody StoreBillingDesk storeBillingDesk) {
		return storeBillingDeskService.addProducts(storeBillingDesk);
	}
	@PutMapping("/StoreBillingDesk/{customer_id}")
	public StoreBillingDesk updateProducts(@RequestBody StoreBillingDesk storeBillingDesk,@PathVariable int customer_id) {
		storeBillingDesk.setCustomer_id(customer_id);
		return storeBillingDeskService.updateProducts(storeBillingDesk);
	}
	@DeleteMapping("/StoreBillingDesk/{customer_id}")
	public void deleteProducts(@RequestParam int customer_id) {
		storeBillingDeskService.deleteProducts(customer_id);
	}
	

}
