package com.oes.entity;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "OEDelivery")
public class DeliveryAgent {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int deliveryAgentId;
	private String deliveryStatus;
	private String payment;
	private String username;
	private String city;
	private String productName;
	private int totalOrderCost;
	private String orderDate;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "OnlineOrders")
	private List<OnlineOrder> allOnlineOrders;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "Products")
	private List<Product> allProducts;

	public DeliveryAgent(String deliveryStatus, String payment, String username, String city, String productName,
			int totalOrderCost, String orderDate) {
		super();
		this.deliveryStatus = deliveryStatus;
		this.payment = payment;
		this.username = username;
		this.city = city;
		this.productName = productName;
		this.totalOrderCost = totalOrderCost;
		this.orderDate = orderDate;
	}
	
	
	
	

}