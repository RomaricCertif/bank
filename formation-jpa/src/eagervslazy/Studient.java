package eagervslazy;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "TSTUDIENT")
public class Studient implements Serializable{
	
	@Id
	@Column(name = "MATRICULE")
	private String studientCd;

	@Column(name = "FULL_NAME")
	private String fullName;
	
	@ManyToOne
	@JoinColumn(name = "CLASS_ROOM_CD")
	private ClassRoom classRoom;
	
	
	
	
	
	public Studient() {
	
	}

	public String getStudientCd() {
		return studientCd;
	}

	public void setStudientCd(String studientCd) {
		this.studientCd = studientCd;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public ClassRoom getClassRoom() {
		return classRoom;
	}

	public void setClassRoom(ClassRoom classRoom) {
		this.classRoom = classRoom;
	}
	
	
}
