package com.dainguyen.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity(name = "chitiet_sp")
public class ChiTietSP {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int maCTSP;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "maSP")
	SanPham sanPham;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "maSize")
	SizeSP sizeSP;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "maMau")
	MauSP mauSP;

	private int soLuong;
	private String ngayNhap;

	public int getMaCTSP() {
		return maCTSP;
	}

	public void setMaCTSP(int maCTSP) {
		this.maCTSP = maCTSP;
	}

	public SanPham getSanPham() {
		return sanPham;
	}

	public void setSanPham(SanPham sanPham) {
		this.sanPham = sanPham;
	}

	public SizeSP getSizeSP() {
		return sizeSP;
	}

	public void setSizeSP(SizeSP sizeSP) {
		this.sizeSP = sizeSP;
	}

	public MauSP getMauSP() {
		return mauSP;
	}

	public void setMauSP(MauSP mauSP) {
		this.mauSP = mauSP;
	}

	public int getSoLuong() {
		return soLuong;
	}

	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}

	public String getNgayNhap() {
		return ngayNhap;
	}

	public void setNgayNhap(String ngayNhap) {
		this.ngayNhap = ngayNhap;
	}

}
