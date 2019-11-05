package com.dainguyen.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dainguyen.DAO.SanPhamDAO;
import com.dainguyen.DAOImp.SanPhamImp;
import com.dainguyen.entity.SanPham;

@Service
public class SanPhamService implements SanPhamImp {
	
	@Autowired 
	SanPhamDAO sanPhamDAO;
	
	public List<SanPham> getDSSP(int spBD) {
		return sanPhamDAO.getDSSP(spBD);
	}

	public SanPham getSPTheoMaSP(int maSP) {
		return sanPhamDAO.getSPTheoMaSP(maSP);
	}

	public List<SanPham> getDSSPTheoDM(int maDM) {
		return sanPhamDAO.getDSSPTheoDM(maDM);
	}

	public boolean XoaSPTheoMaSP(int maSP) {
		
		return sanPhamDAO.XoaSPTheoMaSP(maSP);
	}



}
