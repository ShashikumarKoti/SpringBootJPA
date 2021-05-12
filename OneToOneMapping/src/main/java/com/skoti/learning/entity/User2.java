package com.skoti.learning.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

/*
 *  Implementing With a Foreign Key in JPA
 */

@Entity
@Table(name = "USERS_2")
public class User2 {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int userID;

	private String userName;

	// The mappedBy attribute is now moved to the User2 class since the foreign key
	// is now present in the address table. We've also added the
	// @PrimaryKeyJoinColumn annotation, which indicates that the primary key of the
	// User entity is used as the foreign key value for the associated Address
	// entity.
	@OneToOne(cascade = CascadeType.ALL, mappedBy = "users")
	@PrimaryKeyJoinColumn
	private Address2 address;

	public int getUserID() {
		return userID;
	}

	public void setUserID(int userID) {
		this.userID = userID;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Address2 getAddress() {
		return address;
	}

	public void setAddress(Address2 address) {
		this.address = address;
	}

}
