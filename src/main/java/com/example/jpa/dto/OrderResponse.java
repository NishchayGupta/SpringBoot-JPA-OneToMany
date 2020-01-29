package com.example.jpa.dto;

public class OrderResponse {
	private String custName;
	private String productName;
	
	public OrderResponse() {
		super();
	}
	
	public OrderResponse(String custName, String productName) {
		super();
		this.custName = custName;
		this.productName = productName;
	}
	
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	@Override
	public String toString() {
		return "OrderResponse [custName=" + custName + ", productName=" + productName + "]";
	}
}