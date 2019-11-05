package com.dainguyen.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity(name = "khuyenmai")
public class KhuyenMai {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int maKM;
	
	private String tenKM;
	private String tgBatDau;
	private String tgKetThuc;
	private String moTa;
	private String hinhKM;
	private int giagiam;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "chitietkm",
	joinColumns = {@JoinColumn(name="maKM" ,referencedColumnName ="maKM" )}
	,inverseJoinColumns = {@JoinColumn(name="maSP",referencedColumnName = "maSP")})
	Set<SanPham> listSP;
	
	
	public Set<SanPham> getListSP() {
		return listSP;
	}
	public void setListSP(Set<SanPham> listSP) {
		this.listSP = listSP;
	}
	public int getGiagiam() {
		return giagiam;
	}
	public void setGiagiam(int giagiam) {
		this.giagiam = giagiam;
	}
	public int getMaKM() {
		return maKM;
	}
	public void setMaKM(int maKM) {
		this.maKM = maKM;
	}
	public String getTenKM() {
		return tenKM;
	}
	public void setTenKM(String tenKM) {
		this.tenKM = tenKM;
	}
	public String getTgBatDau() {
		return tgBatDau;
	}
	public void setTgBatDau(String tgBatDau) {
		this.tgBatDau = tgBatDau;
	}
	public String getTgKetThuc() {
		return tgKetThuc;
	}
	public void setTgKetThuc(String tgKetThuc) {
		this.tgKetThuc = tgKetThuc;
	}
	public String getMoTa() {
		return moTa;
	}
	public void setMoTa(String moTa) {
		this.moTa = moTa;
	}
	public String getHinhKM() {
		return hinhKM;
	}
	public void setHinhKM(String hinhKM) {
		this.hinhKM = hinhKM;
	}
}
