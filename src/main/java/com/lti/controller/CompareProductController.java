package com.lti.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lti.model.Product;
import com.lti.model.Supplier;
import com.lti.service.CompareProductService;
import com.lti.service.RetailerProductService;


@RestController
@CrossOrigin(origins="http://localhost:4200")
@RequestMapping("/onlineShopping/api")
public class CompareProductController {
	

	@Autowired
	CompareProductService proService1;
	
	@Autowired
	RetailerProductService proService2;
	
	
	@GetMapping("/products/{prodid1}/{prodid2}/{prodid3}/{prodid4}")
	public List<Product> getProductById(@PathVariable(value="prodid1") int prodid1,@PathVariable(value="prodid2") int prodid2,@PathVariable(value="prodid3") int prodid3,@PathVariable(value="prodid4") int prodid4){
		return proService1.compareProducts(prodid1,prodid2,prodid3,prodid4);
	}
		
		
	@GetMapping("/products/displayall/{supplierid}")
	public List<Product> getProductById(@PathVariable(value="supplierid") int supplierid){
			return proService2.displayBySupplier(supplierid);
			
		}
		
	@DeleteMapping("/products/deleteproduct/{prodid}")
	public boolean deleteProduct(@PathVariable(value="prodid") int prodid){
			return proService2.deleteProduct(prodid);
			
		}
		
	@PostMapping("/products/addproduct")
	public boolean addProduct(@RequestBody Product product) {
			return proService2.addProduct(product);
		}

	@PutMapping("/products/editproduct")
		public boolean editproduct(@RequestBody Product product){
			return proService2.editproduct(product);
			
		}
	
	@GetMapping("/products/updateproduct/{prodid}")
	public Product updateProduct(@PathVariable(value="prodid") int prodid){
			return proService2.updateProduct(prodid);
			
		}
	
	//supplier details for profile
	
	@GetMapping("/products/displaysupplier/{supplierid}")
	public Supplier supplierDetails(@PathVariable(value="supplierid") int supplierid){
		return proService2.displaySupplierDetails(supplierid);
		
	}
	
}
