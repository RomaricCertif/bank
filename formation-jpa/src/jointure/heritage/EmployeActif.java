package jointure.heritage;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;

@Entity
@Table(name = "T_EMPLOYE_ACTIF")
public class EmployeActif extends Employe {

	@Enumerated(EnumType.STRING)
	@Column(name = "PXS")
	private Position position;
	

	public EmployeActif() {
		super();
	}

	public Position getPosition() {
		return position;
	}

	public void setPosition(Position position) {
		this.position = position;
	}
	
	
	
}
