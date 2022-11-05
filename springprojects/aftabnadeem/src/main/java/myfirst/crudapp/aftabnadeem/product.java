package myfirst.crudapp.aftabnadeem;

import javax.persistence.Entity;

import javax.persistence.Id;

import lombok.Data;



@Entity
public class product {
	@Id
	private int id;
	private String productname;
	private String productdescription;
	private String productprice;
	public product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public product(int id, String productname, String productdescription, String productprice) {
		super();
		this.id = id;
		this.productname = productname;
		this.productdescription = productdescription;
		this.productprice = productprice;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	public String getProductdescription() {
		return productdescription;
	}
	public void setProductdescription(String productdescription) {
		this.productdescription = productdescription;
	}
	public String getProductprice() {
		return productprice;
	}
	public void setProductprice(String productprice) {
		this.productprice = productprice;
	}
	@Override
	public String toString() {
		return "product [id=" + id + ", productname=" + productname + ", productdescription=" + productdescription
				+ ", productprice=" + productprice + "]";
	}

}
