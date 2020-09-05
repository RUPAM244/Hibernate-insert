package com.rupam.hibernate.Baischib;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

  @Entity
  public class Employye 
{
	@Id
	@Column(name="Emp_id")
    private int empid;
	@Column(name="Name")
	private String empname;
	@Column(name="Position")
    private String position;
	@Column(name="Email")
	private String email;
    
    
    
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String toString() {
		return "Employye [empid=" + empid + ", empname=" + empname + ", position=" + position + ", email=" + email
				+ "]";
	}
	
	
    
    
	
	
}
