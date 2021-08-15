package com.lti.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="supplier")
public class Supplier {

	@Id
	@Column(name="supplier_id")
	private int supplierId;
	
	@Column(name="company_name")
	private String companyName;
	
	private String phone;
	
	
//	@OneToMany(mappedBy="Supplier")
//	private Set<Product> products=new HashSet<>();
//	
//
//	
//	public Set<Product> getProducts() {
//		return products;
//	}
//
//	public void setProducts(Set<Product> products) {
//		this.products = products;
//	}

	public Supplier() {
		super();
	}

	public Supplier(int supplierId, String companyName, String phone) {
		super();
		this.supplierId = supplierId;
		this.companyName = companyName;
		this.phone = phone;
	}

	public int getSupplierId() {
		return supplierId;
	}

	public void setSupplierId(int supplierId) {
		this.supplierId = supplierId;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
	
	
}
