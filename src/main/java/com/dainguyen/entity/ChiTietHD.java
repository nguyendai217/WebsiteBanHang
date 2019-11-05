package com.dainguyen.entity;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity(name = "chitiethd")
public class ChiTietHD {
	@EmbeddedId
	ChiTietHDId chiTietHDId;

	int soLuong;
	String giaTien;


	public ChiTietHDId getChiTietHDId() {
		return chiTietHDId;
	}

	public void setChiTietHDId(ChiTietHDId chiTietHDId) {
		this.chiTietHDId = chiTietHDId;
	}

	public int getSoLuong() {
		return soLuong;
	}

	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}

	public String getGiaTien() {
		return giaTien;
	}

	public void setGiaTien(String giaTien) {
		this.giaTien = giaTien;
	}
}
