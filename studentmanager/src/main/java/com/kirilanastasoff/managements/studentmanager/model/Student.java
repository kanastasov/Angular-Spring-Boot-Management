package com.kirilanastasoff.managements.studentmanager.model;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Student implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false, updatable = false)
	private Long id;

	private String name;
	private String studentTitle;
	private String phone;
	private String imageUrl;
	@Column(nullable = false, updatable = false)
	private String studentCode;
	private String email;

	public Student() {
		super();
	}

	public Student(Long id, String name, String studentTitle, String phone, String imageUrl, String studentCode,
			String email) {
		super();
		this.id = id;
		this.name = name;
		this.studentTitle = studentTitle;
		this.phone = phone;
		this.imageUrl = imageUrl;
		this.studentCode = studentCode;
		this.email = email;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStudentTitle() {
		return studentTitle;
	}

	public void setStudentTitle(String studentTitle) {
		this.studentTitle = studentTitle;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public String getStudentCode() {
		return studentCode;
	}

	public void setStudentCode(String studentCode) {
		this.studentCode = studentCode;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", studentTitle=" + studentTitle + ", phone=" + phone
				+ ", imageUrl=" + imageUrl + ", studentCode=" + studentCode + "]";
	}

}
