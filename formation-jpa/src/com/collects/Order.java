package com.collects;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "T_ORDERS")
public class Order implements Serializable {

	@Id
	@Column(name = "ORDER_CD")
	private String orderCd;

	@Column(name = "ADRESS_LIVRAISON")
	private String adressLivraison;

	@Temporal(TemporalType.DATE)
	@Column(name = "ORDER_DATE")
	private Date orderDate = new Date();
	
	@ElementCollection
	@CollectionTable(name = "T_ORDER_DTLS",joinColumns = @JoinColumn(referencedColumnName = "ORDER_CD"))
	private List<OrderItems> orderItems=new ArrayList<>();

	public Order() {
	}

	public String getOrderCd() {
		return orderCd;
	}

	public void setOrderCd(String orderCd) {
		this.orderCd = orderCd;
	}

	public String getAdressLivraison() {
		return adressLivraison;
	}

	public void setAdressLivraison(String adressLivraison) {
		this.adressLivraison = adressLivraison;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public List<OrderItems> getOrderItems() {
		return orderItems;
	}

	public void setOrderItems(List<OrderItems> orderItems) {
		this.orderItems = orderItems;
	}
	
	
}
