package com.productapp.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.productapp.entity.Product;
import com.productapp.repositry.ProductRepo;

@Service
public class ProductService {
	@Autowired
	public ProductRepo serviceRepo;
	public List<Product> getProducts(){
		List<Product> products=new ArrayList<>();
		if(this.serviceRepo!=null) {
			this.serviceRepo.findAll().forEach(products::add);
			return products;
		}
		return products;
	}
	
	public String addProduct(Product product) {
		
		if(this.serviceRepo!=null&&this.serviceRepo.save(product)!=null) {
			return "Product added ";
		}
		return "Product Not added";
	}
	
	public String updateProduct(Integer id,Product product) {
		if(this.serviceRepo!=null&&this.serviceRepo.save(product)!=null) {
			return "Product Updated";
		}
		return "Product Not Updated";
	}
	
	public String deleteProduct(Integer id) {
		try {
			this.serviceRepo.deleteById(id);
			return "Product deleted"; 
		}catch(IllegalArgumentException e) {
			return "please enter the correct id";
		}
	}

}
