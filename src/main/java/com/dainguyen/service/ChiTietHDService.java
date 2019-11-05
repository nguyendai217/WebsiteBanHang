package com.dainguyen.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dainguyen.DAO.ChiTietHDDAO;
import com.dainguyen.DAOImp.ChiTietHDImp;
import com.dainguyen.entity.ChiTietHD;

@Service
public class ChiTietHDService implements ChiTietHDImp {
	
	@Autowired
	ChiTietHDDAO chiTietHDDAO;

	public boolean ThemChiTietHD(ChiTietHD chiTietHD) {
		
		return chiTietHDDAO.ThemChiTietHD(chiTietHD) ;
	}

}
