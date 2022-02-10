package com.user.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="registration")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	private String address;
	
	@Column(unique=true)
	private String userId;
	private long phone;
	private String password;
	@Column(name="confirm_password")
	private String confirmPassword;
	
	
	public User(int id, String name, String address, String userId, long phone, String password,
			String confirmPassword) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.userId = userId;
		this.phone = phone;
		this.password = password;
		this.confirmPassword = confirmPassword;
	}
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getUserId() {
		return userId;
	}
	public void setUser(String email) {
		this.userId = userId;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getConfirmpassword() {
		return confirmPassword;
	}
	public void setConfirmpassword(String confirmpassword) {
		this.confirmPassword = confirmpassword;
	}
	@Override
	public String toString() {
		return "Registration [id=" + id + ", name=" + name + ", address=" + address + ", email=" + userId + ", phone="
				+ phone + ", password=" + password + ", confirmPassword=" + confirmPassword + "]";
	}
	
	
}
