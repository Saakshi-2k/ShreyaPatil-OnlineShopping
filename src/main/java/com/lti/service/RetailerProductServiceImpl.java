package com.lti.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.model.Product;
import com.lti.model.Supplier;
import com.lti.repository.ProductRepository;
import com.lti.repository.SupplierRepository;

@Service
@Transactional
public class RetailerProductServiceImpl implements RetailerProductService {

	@Autowired
	ProductRepository prodRepo;

	@Autowired
	SupplierRepository supplierRepo;
	
	@Override
	public boolean addProduct(Product product) {
		prodRepo.save(product);
		return true;

	}


	@Override
	public boolean deleteProduct(int prodid) {
//		prodRepo.delete(product);
		Product newp=prodRepo.findById(prodid).get();
//		newp=product;
		prodRepo.delete(newp);
		return true;
	}

	@Override
	public List<Product> displayBySupplier(int supplierid) {
		return prodRepo.findByIdSupplier(supplierid);
	}

	@Override
	public Product updateProduct(int prodid) {
//		Product newp=prodRepo.findById(prodid).get();
//		prodRepo.save(newp);
		return prodRepo.findById(prodid).get();
	}

	@Override
	public Supplier displaySupplierDetails(int supplierid) {
		// TODO Auto-generated method stub
		return supplierRepo.findById(supplierid).get();

	}

	@Override
	public boolean editproduct(Product product) {
		prodRepo.save(product);
		return true;

	}



//	@Override
//	public List<Product> displayBySupplier(int supplierid) {
//		return prodRepo.findByIdSupplier(supplierid);
//	}
	

}
