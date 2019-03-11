package com.cts.product.service;

import java.util.List;

import com.cts.product.bean.Product;

public interface ProductService {
	public String insertProduct(Product product);
	public String updateProduct(String id,Product product);
	public Product getProductById(String id);
	public List<Product> getAllProduct();
	public List<Product> getProductByName(String name);
}
