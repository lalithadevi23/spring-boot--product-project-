package com.product.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.product.entity.Product;
import com.product.repository.ProductRepository;
@Service
public class ProductServiceImplement implements ProductService {

	@Autowired
	private ProductRepository dao;
	@Override
	public Product addProduct(Product pdt) {
		// TODO Auto-generated method stub
		return dao.save(pdt);
	}

	@Override
	public Product updateProduct(Product pdt) {
		// TODO Auto-generated method stub
		return dao.save(pdt);
	}

	@Override
	public Product deleteProduct(long productId) {
		// TODO Auto-generated method stub
		dao.deleteById(productId);
		return null;
	}

	@Override
	public List<Product> allProduct() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	@Override
	public Product displayProduct(long productId) {
		// TODO Auto-generated method stub
		return dao.findById(productId).get();
	}

}
