package com.collects;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class OrderItems {
	
		@Column(name = "ITEM_CD")
		private String itemCd;
		
		@Column(name = "ITEM_DESCRIPTION")
		private String itemDescription;
		
		@Column(name = "QUANTITY")
		private int quantity;
	
	public OrderItems() {
		
	}

	public String getItemCd() {
		return itemCd;
	}

	public void setItemCd(String itemCd) {
		this.itemCd = itemCd;
	}

	public String getItemDescription() {
		return itemDescription;
	}

	public void setItemDescription(String itemDescription) {
		this.itemDescription = itemDescription;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

}
