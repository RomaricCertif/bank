package jointure.heritage;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name = "T_EMPLOYE")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Employe implements Serializable {
    
	@Id
	@Column(name = "MATRICULE")
	private String matricule;
	
	@Column(name = "FULL_NAME")
	private String fullName;
	

	
	public Employe() {
		
	}

	public String getMatricule() {
		return matricule;
	}

	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}


}
