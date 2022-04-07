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
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.StoreDelivery;
import com.example.demo.services.StoreDeliveryImplementation;

@RestController
public class StoreDeliveryController {
	@Autowired
	private StoreDeliveryImplementation storeDeliveryService;
	
	@GetMapping("/StoreDelivery")
	public List<StoreDelivery> getProducts() {
		return storeDeliveryService.getProducts();
	}
	@GetMapping("/StoreDelivery/{customer_id}")
	public Optional<StoreDelivery> getProduct(@PathVariable int customer_id) {
		return storeDeliveryService.getProduct(customer_id);
	}
	@PostMapping("/StoreDelivery")
	public StoreDelivery addProducts(@RequestBody StoreDelivery storeDelivery) {
		return storeDeliveryService.addProducts(storeDelivery);
	}
	@PutMapping("/StoreDelivery/{customer_id}")
	public StoreDelivery updateProducts(@RequestBody StoreDelivery storeDelivery,@PathVariable int customer_id) {
		storeDelivery.setCustomer_id(customer_id);
		return storeDeliveryService.updateProducts(storeDelivery);
	}
	@DeleteMapping("/StoreDelivery")
	public void deleteProducts(@RequestParam int customer_id) {
		storeDeliveryService.deleteProducts(customer_id);
	}
	
	
	

}
