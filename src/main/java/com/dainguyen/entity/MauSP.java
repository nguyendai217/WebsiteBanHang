package com.dainguyen.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name ="mau_sp")
public class MauSP {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int maMau;
	private String tenMau;
	public int getMaMau() {
		return maMau;
	}
	public void setMaMau(int maMau) {
		this.maMau = maMau;
	}
	public String getTenMau() {
		return tenMau;
	}
	public void setTenMau(String tenMau) {
		this.tenMau = tenMau;
	}
	
	

}
