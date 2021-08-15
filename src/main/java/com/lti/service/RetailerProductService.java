package com.lti.service;

import java.util.List;

import com.lti.model.Product;
import com.lti.model.Supplier;

public interface RetailerProductService {

	public boolean addProduct(Product product);
	//public boolean updateProduct(Product product);
	public Product updateProduct(int prodid);

	public boolean deleteProduct(int prodid);
	public List<Product> displayBySupplier(int supplierid);
	
	public Supplier displaySupplierDetails(int supplierid);
	
	public boolean editproduct(Product product);

	
}
