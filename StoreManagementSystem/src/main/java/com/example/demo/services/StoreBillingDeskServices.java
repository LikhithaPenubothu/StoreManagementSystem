package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import com.example.demo.model.StoreBillingDesk;

public interface StoreBillingDeskServices {
	
    List<StoreBillingDesk> getProducts();
	
	Optional<StoreBillingDesk> getProduct(int customer_id);
	
	StoreBillingDesk addProducts(StoreBillingDesk storeBillingDesk);
	
	StoreBillingDesk updateProducts(StoreBillingDesk storeBillingDesk);

	void deleteProducts(int customer_id);

}
