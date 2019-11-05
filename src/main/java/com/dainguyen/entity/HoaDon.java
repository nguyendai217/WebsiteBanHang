package com.dainguyen.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity(name ="hoadon")
public class HoaDon {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int maHD;

	String tenKH;
	String soDT;
	String diaChi;
	Boolean tinhTrang;
	String ngayLap;
	String hinhthucgiao;
	String ghichu;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "maHD")
	Set<ChiTietHD> listDSChiTietHD;

	public String getHinhthucgiao() {
		return hinhthucgiao;
	}


	public void setHinhthucgiao(String hinhthucgiao) {
		this.hinhthucgiao = hinhthucgiao;
	}


	public String getGhichu() {
		return ghichu;
	}


	public void setGhichu(String ghichu) {
		this.ghichu = ghichu;
	}


	public Set<ChiTietHD> getListDSChiTietHD() {
		return listDSChiTietHD;
	}

	
	public void setListDSChiTietHD(Set<ChiTietHD> listDSChiTietHD) {
		this.listDSChiTietHD = listDSChiTietHD;
	}

	public int getMaHD() {
		return maHD;
	}

	public void setMaHD(int maHD) {
		this.maHD = maHD;
	}

	public String getTenKH() {
		return tenKH;
	}

	public void setTenKH(String tenKH) {
		this.tenKH = tenKH;
	}

	public String getSoDT() {
		return soDT;
	}

	public void setSoDT(String soDT) {
		this.soDT = soDT;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	public Boolean getTinhTrang() {
		return tinhTrang;
	}

	public void setTinhTrang(Boolean tinhTrang) {
		this.tinhTrang = tinhTrang;
	}

	public String getNgayLap() {
		return ngayLap;
	}

	public void setNgayLap(String ngayLap) {
		this.ngayLap = ngayLap;
	}

}
