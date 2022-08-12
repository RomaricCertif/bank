package heritage.mappsupper;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.Version;

@MappedSuperclass
public abstract class AbstractEntity implements Serializable {
	
	@Column(name = "USER_NAME")
	private String userName;
	
	@Column(name = "CREATE_DT")
	private Date createDate=new Date();
	
	
	@Version
	@Column(name = "VRS")
	private int vrs;


	public AbstractEntity() {
		super();
		// TODO Auto-generated constructor stub
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public Date getCreateDate() {
		return createDate;
	}


	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}


	public int getVrs() {
		return vrs;
	}


	public void setVrs(int vrs) {
		this.vrs = vrs;
	}
	
	
	 

}
