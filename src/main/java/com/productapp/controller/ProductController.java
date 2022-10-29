package com.productapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.productapp.entity.Product;
import com.productapp.services.ProductService;

@RestController
@RequestMapping("/product")
public class ProductController {
	@Autowired
	public ProductService productService;
	@GetMapping("/all")
	public List<Product> getProducts(){
		return this.productService.getProducts();
	}
	
	@PostMapping("/add")
	public String addProduct(@RequestBody Product product) {
		return this.productService.addProduct(product);
	}
	@DeleteMapping("/delete/{custid}")
	public String deleteProduct(@PathVariable String custid) {
		return this.productService.deleteProduct(Integer.parseInt(custid));
	}
	
	@PutMapping("/update/{custid}")
	public String updateProduct (@PathVariable String custid,@RequestBody Product product) {
		return this.productService.updateProduct(Integer.parseInt(custid), product);
	}

}
