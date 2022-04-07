package com.example.demo.model;

import java.math.BigInteger;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Entity
@Table(name="deliveries")

public class StoreDelivery {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	@Column(name="customer_id")
	private int customer_id;
	
	@Column(name="emp_id")
	private int emp_id;
	
	@Column(name="products_brought")
	private String products_brought;
	
	@Column(name="total_amount")
	private float total_amount;
	
	@Column(name="address")
	private String address;
	
	@Column(name="phone_no")
	private BigInteger phone_no;
	
	
	public int getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}
	public int getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}
	public String getProducts_brought() {
		return products_brought;
	}
	public void setProducts_brought(String products_brought) {
		this.products_brought = products_brought;
	}
	public float getTotal_amount() {
		return total_amount;
	}
	public void setTotal_amount(float total_amount) {
		this.total_amount = total_amount;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public BigInteger getPhone_no() {
		return phone_no;
	}
	public void setPhone_no(BigInteger phone_no) {
		this.phone_no = phone_no;
	}

}
