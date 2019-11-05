package com.dainguyen.DAOImp;

import com.dainguyen.entity.NhanVien;

public interface NhanVienImp {
	boolean KiemTraLogin(String email, String password);
	boolean addNhanVien(NhanVien nhanVien);
}
