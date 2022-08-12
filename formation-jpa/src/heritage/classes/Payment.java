package heritage.classes;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Payment implements Serializable{
	
	@Id
	@Column(name = "PAY_ID")
	private String payCd;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "PAY_DT")
	private Date payDt=new Date();
	
	
	@Column(name = "AMOUNT")
	private double amount;
	
	public Payment() {
	
	}

	public String getPayCd() {
		return payCd;
	}

	public void setPayCd(String payCd) {
		this.payCd = payCd;
	}

	public Date getPayDt() {
		return payDt;
	}

	public void setPayDt(Date payDt) {
		this.payDt = payDt;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}



}
