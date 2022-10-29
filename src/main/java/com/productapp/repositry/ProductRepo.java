package com.productapp.repositry;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.productapp.entity.Product;
@Repository
public interface ProductRepo extends CrudRepository<Product, Integer> {

}
