package com.dainguyen.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dainguyen.DAO.NhanVienDAO;
import com.dainguyen.DAOImp.NhanVienImp;
import com.dainguyen.entity.NhanVien;

@Service
public class NhanVienService implements NhanVienImp {

	@Autowired
	NhanVienDAO nhanVienDAO;

	public boolean KiemTraLogin(String email, String password) {
		boolean kt = nhanVienDAO.KiemTraLogin(email, password);
		return kt;
	}

	public boolean addNhanVien(NhanVien nhanVien) {
		boolean ktnv=nhanVienDAO.addNhanVien(nhanVien);
		return ktnv;
	}
}
