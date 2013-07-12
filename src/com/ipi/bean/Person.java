package com.ipi.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;



/** @author Saifi Ahmada Jul 11, 2013 1:51:51 PM  **/
@Entity
@Table(name="PERSON")
public class Person {
	
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="PERSON_ID")
	private int personId;
	@Column(name="PERSON_NAME")
	private String personName;
	@OneToOne
	@JoinColumn(name="VEHICLE_ID")
	private Vehicle vehicle;
	
	public Person() {
	
	}

	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	public int getPersonId() {
		return personId;
	}

	public void setPersonId(int personId) {
		this.personId = personId;
	}

	public String getPersonName() {
		return personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}
	
}

