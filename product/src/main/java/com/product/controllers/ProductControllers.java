package com.product.controllers;

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

import com.product.entity.Product;
import com.product.service.ProductService;

@RestController
@RequestMapping("/product")

public class ProductControllers {
	@Autowired
	private ProductService service;
	
	@PostMapping("/addproduct")
	public Product addProduct(@RequestBody Product pdt) {
		return service.addProduct(pdt);
	}
	@GetMapping({"/","/allproduct"})
	public List<Product> allProduct(){
		return service.allProduct();
	}
	@GetMapping("/displayproduct/{id}")
	public Product displayProduct(@PathVariable("id")long productId) {
		return service.displayProduct(productId);
	}
	@PutMapping("/updateproduct/{id}")
	Product updateProduct(@PathVariable("id")long productId,@RequestBody Product pdt) {
		Product p = service.displayProduct(productId);
		p.setProductName(pdt.getProductName());
		p.setProductCategory(pdt.getProductCategory());
		p.setProductExpDate(pdt.getProductExpDate());
		p.setProductMnfDate(pdt.getProductMnfDate());
		p.setProductPrice(pdt.getProductPrice());
		return service.updateProduct(p);
	}
	@DeleteMapping("/deleteproduct/{id}")
	Product deleteProduct(@PathVariable("id") long productId) {
		return service.deleteProduct(productId);
	}
}
