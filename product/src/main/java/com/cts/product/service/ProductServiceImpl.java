package com.cts.product.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.product.bean.Product;
import com.cts.product.dao.ProductDAO;
import com.cts.product.dao.ProductDAOImpl;

@Service("productService")
public class ProductServiceImpl implements ProductService{
	@Autowired
	private ProductDAO productDAO = new ProductDAOImpl();

	public String insertProduct(Product product) {
		// TODO Auto-generated method stub
		return productDAO.insertProduct(product);
	}

	public String updateProduct(String id, Product product) {
		// TODO Auto-generated method stub
		return productDAO.updateProduct(id, product);
	}

	public Product getProductById(String id) {
		// TODO Auto-generated method stub
		return productDAO.getProductById(id);
	}

	public List<Product> getAllProduct() {
		// TODO Auto-generated method stub
		return productDAO.getAllProduct();
	}

	public List<Product> getProductByName(String name) {
		// TODO Auto-generated method stub
		return productDAO.getProductByName(name);
	}

}
