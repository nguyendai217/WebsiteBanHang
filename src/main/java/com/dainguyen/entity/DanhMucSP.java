package com.dainguyen.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity(name = "danhmuc_sp")
public class DanhMucSP {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int maDM;
	private String tenDM;
	private String hinhDM;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name ="maDM")
	Set<SanPham> listSanPham;

	public Set<SanPham> getListSanPham() {
		return listSanPham;
	}

	public void setListSanPham(Set<SanPham> listSanPham) {
		this.listSanPham = listSanPham;
	}

	public int getMaDM() {
		return maDM;
	}

	public void setMaDM(int maDM) {
		this.maDM = maDM;
	}

	public String getTenDM() {
		return tenDM;
	}

	public void setTenDM(String tenDM) {
		this.tenDM = tenDM;
	}

	public String getHinhDM() {
		return hinhDM;
	}

	public void setHinhDM(String hinhDM) {
		this.hinhDM = hinhDM;
	}

}
