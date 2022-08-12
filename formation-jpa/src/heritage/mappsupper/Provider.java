package heritage.mappsupper;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "T_PROVIDER")
public class Provider extends AbstractEntity{

	@Id
	@Column(name = "PROVIDER_ID")
	private String providerId;
	
	@Column(name = "PROVIDER_NAME")
	private String providerName;
	
	public Provider() {
		// TODO Auto-generated constructor stub
	}

	public String getProviderId() {
		return providerId;
	}

	public void setProviderId(String providerId) {
		this.providerId = providerId;
	}

	public String getProviderName() {
		return providerName;
	}

	public void setProviderName(String providerName) {
		this.providerName = providerName;
	}
	
	
}
