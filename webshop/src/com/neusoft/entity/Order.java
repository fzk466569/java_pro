package com.neusoft.entity;

public class Order {
	private String orderId;
	private String orderDtaId;
	private String productId;
	private String productName;
	private String productManey;
	private String productNum;
	
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getOrderDtaId() {
		return orderDtaId;
	}
	public void setOrderDtaId(String orderDtaId) {
		this.orderDtaId = orderDtaId;
	}
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductManey() {
		return productManey;
	}
	public void setProductManey(String productManey) {
		this.productManey = productManey;
	}
	public String getProductNum() {
		return productNum;
	}
	public void setProductNum(String productNum) {
		this.productNum = productNum;
	}
}