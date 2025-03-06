package com;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Adharcard {
	
	@Id
	private long ano;
	private String FatherName;
	private String address;
	private String dob;
	
	@OneToOne(mappedBy = "Adharcard")
	private person person;

	public long getAno() {
		return ano;
	}

	public void setAno(long ano) {
		this.ano = ano;
	}

	public String getFatherName() {
		return FatherName;
	}

	public void setFatherName(String fatherName) {
		FatherName = fatherName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public person getPerson() {
		return person;
	}
	public void setPerson(person person) {
		this.person = person;
	}

	@Override
	public String toString() {
		return "Adharcard [ano=" + ano + ", FatherName=" + FatherName + ", address=" + address + ", dob=" + dob + "]";
	}

	

	
	
	

}
