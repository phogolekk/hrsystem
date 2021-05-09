package org.sars.hrsystem.entities;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class EmployeeContactDetails {

	@Column(name = "LAND_LINE")
	private String landline;
	@Column(name = "CELL_NUMBER")
	private String cellNumber;

	@Column(name = "EMAIL")
	private String email;
	@Column(name = "SOCIAL_ADDRESS")
	private String socialAddress;

	public EmployeeContactDetails() {

	}

	public EmployeeContactDetails(String landline, String cellNumber, String email, String socialAddress) {
		super();
		this.landline = landline;
		this.cellNumber = cellNumber;
		this.email = email;
		this.socialAddress = socialAddress;
	}

	public String getLandline() {
		return landline;
	}

	public void setLandline(String landline) {
		this.landline = landline;
	}

	public String getCellNumber() {
		return cellNumber;
	}

	public void setCellNumber(String cellNumber) {
		this.cellNumber = cellNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSocialAddress() {
		return socialAddress;
	}

	public void setSocialAddress(String socialAddress) {
		this.socialAddress = socialAddress;
	}

	@Override
	public String toString() {
		return "ContactDetails [landline=" + landline + ", cellNumber=" + cellNumber + ", email=" + email
				+ ", socialAddress=" + socialAddress + "]";
	}

	
}
