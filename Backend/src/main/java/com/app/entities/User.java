package com.app.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="USER")
public class User {
	
	
	  @Id
	  @GeneratedValue(strategy = GenerationType.IDENTITY)
	  private int user_id;
	  private String name;
	  private String contact;
	  private String address;
	  @Column(unique = true)
	  private String email;
	  @Column(nullable = false)
	  private String password;
	  @Enumerated(EnumType.STRING)
	  private Role role;
	  


	public User() {
		
	}



	public User(int user_id, String name, String contact, String address, String email, String password, Role role) {
		super();
		this.user_id = user_id;
		this.name = name;
		this.contact = contact;
		this.address = address;
		this.email = email;
		this.password = password;
		this.role = role;
	}



	public int getUser_id() {
		return user_id;
	}



	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getContact() {
		return contact;
	}



	public void setContact(String contact) {
		this.contact = contact;
	}



	public String getAddress() {
		return address;
	}



	public void setAddress(String address) {
		this.address = address;
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



	



	public Role getRole() {
		return role;
	}



	public void setRole(Role role) {
		this.role = role;
	}



	@Override
	public String toString() {
		return "User [name=" + name + ", contact=" + contact + ", address=" + address
				+ ", email=" + email + ", password=" + password + ", role=" + role + "]";
	}

	
	

	  
	 
	  
	  
	  
}