package com.maps;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "T_PERSONS")
public class Person implements Serializable {
	
	@Id
	@Column(name = "PERSON_ID")
	private String personId;
	
	@Column(name = "FIRST_NAME")
	private String firstName;
	

	@Column(name = "LAST_NAME")
	private String lastName;
	
	@ElementCollection
	private Map<String,Certificate> certificates=new HashMap<>();
	
	public Person() {
	
	}

	public String getPersonId() {
		return personId;
	}

	public void setPersonId(String personId) {
		this.personId = personId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Map<String, Certificate> getCertificates() {
		return certificates;
	}

	public void setCertificates(Map<String, Certificate> certificates) {
		this.certificates = certificates;
	}

}
