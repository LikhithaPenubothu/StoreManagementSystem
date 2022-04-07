package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import com.example.demo.model.StoreDelivery;

public interface StoreDeliveryServices {
	
    List<StoreDelivery> getProducts();
	
	Optional<StoreDelivery> getProduct(int customer_id);
	
	StoreDelivery addProducts(StoreDelivery storeDelivery);
	
	StoreDelivery updateProducts(StoreDelivery storeDelivery);

	void deleteProducts(int customer_id);

}
