package com.product.service;

import java.util.List;

import com.product.entity.Product;

public interface ProductService {
	Product addProduct(Product pdt);
	Product updateProduct(Product pdt);
	Product deleteProduct(long productId);
	List<Product> allProduct();
	Product displayProduct(long productId);

}
