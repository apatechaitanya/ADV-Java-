package com.cdac.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="tbl_Hibernate11")
public class Employee {
	
	@Id
	@Column(name="empno")
	private int empno;
	
	@Column(name="name")
	private String name;
	
	@Column(name="password")
	private String password;

	public int getEmpno() {
		return empno;
	}

	public void setEmpno(int empno) {
		this.empno = empno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	
	
}
