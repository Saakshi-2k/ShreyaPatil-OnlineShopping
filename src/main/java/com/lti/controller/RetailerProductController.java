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
import com.lti.service.RetailerProductService;


@RestController
@CrossOrigin(origins="http://localhost:4200")
@RequestMapping("/onlineShopping/api")
public class RetailerProductController {
	
//	@Autowired
//	RetailerProductService proService;
//	
//	@GetMapping("/products/{supplierid}")
//	public List<Product> getProductById(@PathVariable(value="supplierid") int supplierid){
//		return proService.displayBySupplier(supplierid);
//		
//	}
//	
//	@DeleteMapping("/products/deleteproduct/{prodid}")
//	public boolean deleteProduct(@PathVariable(value="prodid") int prodid){
//		return proService.deleteProduct(prodid);
//		
//	}
//	
//	@PostMapping("/products/addproduct")
//	public boolean addProduct(@RequestBody Product product) {
//		return proService.addProduct(product);
//	}
//
//	@PutMapping("/products/updateproduct")
//	public boolean updateProduct(@RequestBody Product product){
//		return proService.updateProduct(product);
//		
//	}
}
