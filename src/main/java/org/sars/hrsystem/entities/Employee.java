package org.sars.hrsystem.entities;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity()
@Table(name ="EMPLOYEE")
public class Employee {
	
	@Id
	@GeneratedValue()
	private Long id;
	
	@Column(name ="FIRST_NAME", length = 100, nullable = false)
	private String firstName;
	
	@Column(name ="LAST_NAME", length = 100, nullable = false)
	private String lastName;
	
	@Embedded
	private EmployeeAdress address;
	@Embedded
	private EmployeeContactDetails contactDetails;
	

	public Employee() {
	}
	
	public Employee(Long id, String firstName, String lastName, EmployeeAdress address, EmployeeContactDetails contactDetails) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.contactDetails = contactDetails;
	}



	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
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
	public EmployeeAdress getAddress() {
		return address;
	}
	public void setAddress(EmployeeAdress address) {
		this.address = address;
	}
	public EmployeeContactDetails getContactDetails() {
		return contactDetails;
	}
	public void setContactDetails(EmployeeContactDetails contactDetails) {
		this.contactDetails = contactDetails;
	}




	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", address=" + address
				+ ", contactDetails=" + contactDetails + "]";
	}
	
	

}
