package com.lti.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.lti.model.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

	
//	
	@Query("from Product p where p.prodId= ?1 OR p.prodId=?2 OR p.prodId= ?3 OR p.prodId=?4")
    public List<Product> findByIdCompare(int prodid1,int prodid2,int prodid3,int prodid4);


	@Query("from Product p where p.supplierId= ?1")
	public List<Product> findByIdSupplier(int supplierid);
}
