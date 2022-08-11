package com.doranco.doranco.bank.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "T_RETRAIT")
public class Retrait extends Operation {

	@Column(name = "PIECE_ID")
	private String piece;
	
	@Column(name = "EXPIRATION_DT")
	private Date expirationDate=new Date();
	
	public Retrait() {
		
	}

	public String getPiece() {
		return piece;
	}

	public void setPiece(String piece) {
		this.piece = piece;
	}

	public Date getExpirationDate() {
		return expirationDate;
	}

	public void setExpirationDate(Date expirationDate) {
		this.expirationDate = expirationDate;
	}
	
	
}
