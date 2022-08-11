package com.doranco.doranco.bank.model;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("E")
public class Enterprise extends Customer {

	@Column(name = "SOCIAL_REASON")
	private String socialReason;
	
	@Column(name = "RESPONSABLE")
	private String responsable;
	
	public Enterprise() {
		
	}

	public String getSocialReason() {
		return socialReason;
	}

	public void setSocialReason(String socialReason) {
		this.socialReason = socialReason;
	}

	public String getResponsable() {
		return responsable;
	}

	public void setResponsable(String responsable) {
		this.responsable = responsable;
	}
	
	
}
