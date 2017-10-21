package model;

import javax.persistence.Column;

import javax.persistence.GeneratedValue;
import javax.persistence.*;
import javax.persistence.Table;

import org.hibernate.annotations.Entity;

@Entity
@Table(name="EMPLOYEE")
public class Employee
{
	@Id @GeneratedValue
	   @Column(name = "id")
	   private int id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="address")
	private String address;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	

}
