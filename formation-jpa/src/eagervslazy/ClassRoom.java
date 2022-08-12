package eagervslazy;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "T_CLASS_ROOM")
public class ClassRoom implements Serializable{
	
	@Id
	@Column(name = "CLASS_ROOM_CD")
	private String classRoomCd;
	
	@Column(name = "DESCRIPTION")
	private String description;
	
	@OneToMany(mappedBy = "classRoom")
	private List<Studient> studients=new ArrayList<>();
	
	public ClassRoom() {
		
	}

	public String getClassRoomCd() {
		return classRoomCd;
	}

	public void setClassRoomCd(String classRoomCd) {
		this.classRoomCd = classRoomCd;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<Studient> getStudients() {
		return studients;
	}

	public void setStudients(List<Studient> studients) {
		this.studients = studients;
	}

}
