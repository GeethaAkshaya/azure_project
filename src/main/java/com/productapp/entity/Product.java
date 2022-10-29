package com.productapp.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Product {
	@Id
	private int productId;
	private String productCategory;
	private String productName;
	private double productPrice;
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductCategory() {
		return productCategory;
	}
	public void setProductCategory(String productCategory) {
		this.productCategory = productCategory;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public double getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}
	public Product(int productId, String productCategory, String productName, double productPrice) {
		super();
		this.productId = productId;
		this.productCategory = productCategory;
		this.productName = productName;
		this.productPrice = productPrice;
	}
	public Product() {
		super();
	}
	
	

}
