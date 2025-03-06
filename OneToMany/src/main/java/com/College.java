package com;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class College {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private int id;
	private String Collegename;
	private String location;
	private String email;
	private long contact;
	
	
	@OneToMany(cascade = CascadeType.ALL)
	private List<Department> Departments;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCollegename() {
		return Collegename;
	}

	public void setCollegename(String collegename) {
		Collegename = collegename;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getContact() {
		return contact;
	}

	public void setContact(long contact) {
		this.contact = contact;
	}

	public List<Department> getDepartments() {
		return Departments;
	}

	public void setDepartments(List<Department> departments) {
		Departments = departments;
	}

	@Override
	public String toString() {
		return "College [id=" + id + ", Collegename=" + Collegename + ", location=" + location + ", email=" + email
				+ ", contact=" + contact + "]";
	}
	
	
	

}
