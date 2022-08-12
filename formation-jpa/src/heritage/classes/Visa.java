package heritage.classes;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "T_VISA")
public class Visa extends Payment{
	
	@Column(name = "VISA_CD")
	private String visaCd;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "EXPIRATE_DT")
	private Date expirateDate=new Date();
	
	public Visa() {

	}

	public String getVisaCd() {
		return visaCd;
	}

	public void setVisaCd(String visaCd) {
		this.visaCd = visaCd;
	}

}
