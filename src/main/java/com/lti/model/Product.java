package com.lti.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="product")
public class Product {
	
	
	@Id
    @GeneratedValue
	@Column(name="product_id")
	private int prodId;
	@Column(name="product_name")	
	private String prodName;
	@Column(name="supplier_id")		
	private int supplierId;
	@Column(name="unit_price")			
	private int price;
	
	private String brand;
	
	@Column(name="in_stock")			
	private int stock;
	
	private String pcategory;
	
	private String pdescription;
	
	private String url;
	
	
	
//	@ManyToOne(cascade= CascadeType.ALL)
//	@JoinColumn(name="supplier_id",referencedColumnName = "supplier_id")
//	private Supplier supplier;
//
//	
//	public Supplier getSupplier() {
//		return supplier;
//	}
//
//	public void setSupplier(Supplier supplier) {
//		this.supplier = supplier;
//	}
//






	public Product() {
		super();
	}



	public int getProdId() {
		return prodId;
	}


	public void setProdId(int prodId) {
		this.prodId = prodId;
	}


	public String getProdName() {
		return prodName;
	}


	public void setProdName(String prodName) {
		this.prodName = prodName;
	}


	public int getSupplierId() {
		return supplierId;
	}


	public void setSupplierId(int supplierId) {
		this.supplierId = supplierId;
	}


	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}


	public String getBrand() {
		return brand;
	}


	public void setBrand(String brand) {
		this.brand = brand;
	}


	public int getStock() {
		return stock;
	}


	public void setStock(int stock) {
		this.stock = stock;
	}



	public String getPcategory() {
		return pcategory;
	}



	public void setPcategory(String pcategory) {
		this.pcategory = pcategory;
	}




	public String getPdescription() {
		return pdescription;
	}




	public void setPdescription(String pdescription) {
		this.pdescription = pdescription;
	}


	public String getUrl() {
		return url;
	}




	public void setUrl(String url) {
		this.url = url;
	}




	public Product(int prodId, String prodName, int supplierId, int price, String brand, int stock, String pcategory,
			String pdescription, String url) {
		super();
		this.prodId = prodId;
		this.prodName = prodName;
		this.supplierId = supplierId;
		this.price = price;
		this.brand = brand;
		this.stock = stock;
		this.pcategory = pcategory;
		this.pdescription = pdescription;
		this.url=url;
	
	
}
}


	
	
	




