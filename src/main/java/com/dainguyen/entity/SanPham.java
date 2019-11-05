package com.dainguyen.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity(name = "sanpham")
public class SanPham  {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int maSP;
	
	private String tenSP;
	private String giaTien;
	private String moTa;
	private String hinhSP;
	private String gianhcho;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name ="maDM")
	DanhMucSP danhMucSP;


	@OneToMany(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
	@JoinColumn(name = "maSP")
	Set<ChiTietSP>listChiTietSP;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "chitietkm",
	joinColumns = {@JoinColumn(name="maSP" ,referencedColumnName ="maSP" )}
	,inverseJoinColumns = {@JoinColumn(name="maKM",referencedColumnName = "maKM")})
	Set<KhuyenMai>listKhuyenMai;
	
	
	public String getGianhcho() {
		return gianhcho;
	}

	public void setGianhcho(String gianhcho) {
		this.gianhcho = gianhcho;
	}

	public Set<KhuyenMai> getListKhuyenMai() {
		return listKhuyenMai;
	}

	public void setListKhuyenMai(Set<KhuyenMai> listKhuyenMai) {
		this.listKhuyenMai = listKhuyenMai;
	}

	public Set<ChiTietSP> getListChiTietSP() {
		return listChiTietSP;
	}

	public void setListChiTietSP(Set<ChiTietSP> listChiTietSP) {
		this.listChiTietSP = listChiTietSP;
	}

	public int getMaSP() {
		return maSP;
	}

	public void setMaSP(int maSP) {
		this.maSP = maSP;
	}

	public String getTenSP() {
		return tenSP;
	}

	public void setTenSP(String tenSP) {
		this.tenSP = tenSP;
	}

	public String getGiaTien() {
		return giaTien;
	}

	public void setGiaTien(String giaTien) {
		this.giaTien = giaTien;
	}

	public String getMoTa() {
		return moTa;
	}

	public void setMoTa(String moTa) {
		this.moTa = moTa;
	}

	public String getHinhSP() {
		return hinhSP;
	}

	public void setHinhSP(String hinhSP) {
		this.hinhSP = hinhSP;
	}

	public DanhMucSP getDanhMucSP() {
		return danhMucSP;
	}

	public void setDanhMucSP(DanhMucSP danhMucSP) {
		this.danhMucSP = danhMucSP;
	}
	
	
}
