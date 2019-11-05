package com.dainguyen.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "size_sp")
public class SizeSP {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int maSize;
	private String size;
	public int getMaSize() {
		return maSize;
	}
	public void setMaSize(int maSize) {
		this.maSize = maSize;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	
}
