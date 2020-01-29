package com.example.jpa.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;


@Entity
public class Customer {
	@Id
	@GeneratedValue
	private int custId;
	private String custName;
	private String gender;
	private int age;
	
	@OneToMany(targetEntity = Product.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "customer_productID", referencedColumnName = "custId")
	//@OnDelete(action = OnDeleteAction.CASCADE)
	private List<Product> productList;

	public int getCustId() {
		return custId;
	}

	public void setCustId(int custId) {
		this.custId = custId;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public List<Product> getProducts() {
		return productList;
	}

	public void setProducts(List<Product> products) {
		this.productList = products;
	}

	public Customer(int custId, String custName, String gender, int age, List<Product> products) {
		super();
		this.custId = custId;
		this.custName = custName;
		this.gender = gender;
		this.age = age;
		this.productList = products;
	}

	public Customer() {
	}

	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", custName=" + custName + ", gender=" + gender + ", age=" + age
				+ ", products=" + productList + "]";
	}
}