package com.lti.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.model.Product;
import com.lti.repository.ProductRepository;

@Service
@Transactional
public class CompareProductServiceImpl implements CompareProductService {

	@Autowired
	ProductRepository prodRepo;

	@Override
	public List<Product> compareProducts(int prodid1,int prodid2,int prodid3,int prodid4) {
		//return prodRepo.findByIdCompare(prodid1,prodid2).get();
		return prodRepo.findByIdCompare(prodid1,prodid2,prodid3,prodid4);
	}
	


}
