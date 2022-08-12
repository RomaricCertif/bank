package jointure.heritage;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "EMPLOYE_RETRAITE")
public class EmployeRetraite extends Employe{

	@Temporal(TemporalType.DATE)
	@Column(name = "DATE_RETRAITE")
	private Date retraiteDate=new Date();

	public Date getRetraiteDate() {
		return retraiteDate;
	}

	public void setRetraiteDate(Date retraiteDate) {
		this.retraiteDate = retraiteDate;
	}
	
	
}
