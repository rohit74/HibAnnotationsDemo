/**
 * 
 */
/**
 * @author rohit
 *
 */
package com.kushal.entities;

import javax.persistence.*;

@Entity
@Table(name="EMPLOYEE")
public class Employee{

	@Id
	@GeneratedValue
	@Column(name = "id")
	private int id;
	@Column(name="first_name")
	private String firstName;
	
	@Column(name="last_name")
	private String lasttName;
	
	@Column(name="salary")
	private int salary;

	public Employee(){}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLasttName() {
		return lasttName;
	}

	public void setLasttName(String lasttName) {
		this.lasttName = lasttName;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	}
