package com.skoti.learning.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="ADDRESS_2")
public class Address2 {

	@Id
    private int addressID;
	
	private String street;
	
	private String city;
	
	//we've added the @MapsId annotation, which indicates that the primary key values will be copied from the User2 entity
	@OneToOne
	@MapsId
	@JoinColumn(name="addressID")
	private User2 users;

	public int getAddressID() {
		return addressID;
	}

	public void setAddressID(int addressID) {
		this.addressID = addressID;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public User2 getUsers() {
		return users;
	}

	public void setUsers(User2 users) {
		this.users = users;
	}
	
}
