package com.vs.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity()
@Table(name="studentdetails")
public class Student {
       @Id
       @Column(name="id")
	   private int id;
       @Column(name="name")
	   private String name;
       @Column(name="dob")
	   private String dob;
       @Column(name="email")
	   private String email;
       @Column(name="password")
	   private String password;
       @Column(name="cpassword")
	   private String cpassword;
       
       //These are used to interact with database;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getCpassword() {
		return cpassword;
	}

	public void setCpassword(String cpassword) {
		this.cpassword = cpassword;
	}

}
