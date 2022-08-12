package heritage.classes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "T_VIREMENT")
public class Virement extends Payment{
	
	@Column(name = "ACCOUNT_NUMBER")
	private String accountNumber;
	
	public Virement() {
		
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

}
