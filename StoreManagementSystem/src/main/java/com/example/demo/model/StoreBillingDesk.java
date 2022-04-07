package com.example.demo.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
@Table(name="billingdesk")

public class StoreBillingDesk {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	@Column(name="customer_id")
	private int customer_id;
	
	@Column(name="billing_desk_no")
	private int billing_desk_no;
	
	@Column(name="product_brought")
	private String product_brought;
	
	@Column(name="product_price")
	private float product_price;
	
	@Column(name="total_amount")
	private float total_amount;
	
	@Temporal(TemporalType.DATE)
	@Column(name="date")
	private Date date;

	public int getCustomer_id() {
		return customer_id;
	}

	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}

	public int getBilling_desk_no() {
		return billing_desk_no;
	}

	public void setBilling_desk_no(int billing_desk_no) {
		this.billing_desk_no = billing_desk_no;
	}

	public String getProduct_brought() {
		return product_brought;
	}

	public void setProduct_brought(String product_brought) {
		this.product_brought = product_brought;
	}

	public float getProduct_price() {
		return product_price;
	}

	public void setProduct_price(float product_price) {
		this.product_price = product_price;
	}

	public float getTotal_amount() {
		return total_amount;
	}

	public void setTotal_amount(float total_amount) {
		this.total_amount = total_amount;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

}
