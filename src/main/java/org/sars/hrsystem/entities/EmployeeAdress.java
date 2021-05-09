package org.sars.hrsystem.entities;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class EmployeeAdress {

	@Column(name = "RES_ADDRESS")
	private String residentialAddress;

	@Column(name = "ZIP_CODE")
	private String zipCode;
	@Column(name = "CITY")
	private String city;
	@Column(name = "COUNTRY")
	private String country;

	@Column(name = "POST_ADDRESS")
	private String postalAddress;

	public EmployeeAdress(String residentialAddress, String zipCode, String city, String country, String postalAddress) {
		super();
		this.residentialAddress = residentialAddress;
		this.zipCode = zipCode;
		this.city = city;
		this.country = country;
		this.postalAddress = postalAddress;
	}

	public EmployeeAdress() {

	}

	public String getResidentialAddress() {
		return residentialAddress;
	}

	public void setResidentialAddress(String residentialAddress) {
		this.residentialAddress = residentialAddress;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getPostalAddress() {
		return postalAddress;
	}

	public void setPostalAddress(String postalAddress) {
		this.postalAddress = postalAddress;
	}

	@Override
	public String toString() {
		return "Adress [residentialAddress=" + residentialAddress + ", zipCode=" + zipCode + ", city=" + city
				+ ", country=" + country + ", postalAddress=" + postalAddress + "]";
	}

	
}
