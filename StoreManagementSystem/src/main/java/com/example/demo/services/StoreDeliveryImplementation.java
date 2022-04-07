package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.StoreDelivery;
import com.example.demo.repository.StoreDeliveryRepository;


@Service
public class StoreDeliveryImplementation implements StoreDeliveryServices {
	
	@Autowired
	private StoreDeliveryRepository storeDeliveryRepository;
	
    @Override
	public
	List<StoreDelivery> getProducts() {
		
		return storeDeliveryRepository.findAll();
	}
    @Override
    public Optional<StoreDelivery> getProduct(int customer_id){
    	System.out.println("Inside getProduct");
    	Optional<StoreDelivery> optionaldata=storeDeliveryRepository.findById(customer_id);
		return optionaldata;
    	
    }
	@Override
	public StoreDelivery addProducts(StoreDelivery storeDelivery) {
		return storeDeliveryRepository.save(storeDelivery);
	}
	@Override
	public StoreDelivery updateProducts(StoreDelivery storeDelivery) {
		return storeDeliveryRepository.save(storeDelivery);
	}
	@Override
    public void deleteProducts(int customer_id) {
    	storeDeliveryRepository.deleteById(customer_id);
    }


}
