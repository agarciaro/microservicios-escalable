package com.imagina.products.services;

import java.util.List;

import com.imagina.products.model.dtos.ProductRequest;
import com.imagina.products.model.dtos.ProductResponse;

public interface ProductService {

	void addProduct(ProductRequest productRequest);

	List<ProductResponse> getAllProducts();

}