package com.maps;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Embeddable
public class Certificate {
	
	
	@Column(name = "CERTIFICATE_CD")
	private String certificateCd;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "CERTIFICATE_DT")
	private Date certificateDate=new Date();
	
	public Certificate() {
	
	}

	public String getCertificateCd() {
		return certificateCd;
	}

	public void setCertificateCd(String certificateCd) {
		this.certificateCd = certificateCd;
	}

	public Date getCertificateDate() {
		return certificateDate;
	}

	public void setCertificateDate(Date certificateDate) {
		this.certificateDate = certificateDate;
	}

}
