package com.cg.entity;

import javax.persistence.*;

@Entity
@Table(name="address70")
public class Address {
	@Id
	private int addressId;
	private String streetName;
	private int pinCode;
	public int getAddressId() {
		return addressId;
	}
	public void setAddressId(int addressId) {
		this.addressId = addressId; 
	}
	public String getStreetName() {
		return streetName;
	}
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	public int getPinCode() {
		return pinCode;
	}
	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}
}
