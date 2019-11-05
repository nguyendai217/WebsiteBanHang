package com.dainguyen.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name ="chucvu")
public class ChucVu {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // khoa chinh tu dong tang
	private int maCV;
	private String tenCV;
	
	public int getMaCV() {
		return maCV;
	}
	public void setMaCV(int maCV) {
		this.maCV = maCV;
	}
	public String getTenCV() {
		return tenCV;
	}
	public void setTenCV(String tenCV) {
		this.tenCV = tenCV;
	}
	
}
