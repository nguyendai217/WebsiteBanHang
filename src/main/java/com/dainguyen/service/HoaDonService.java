package com.dainguyen.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dainguyen.DAO.HoaDonDAO;
import com.dainguyen.DAOImp.HoaDonImp;
import com.dainguyen.entity.HoaDon;

@Service
public class HoaDonService implements HoaDonImp {
	
	@Autowired
	HoaDonDAO hoaDonDAO;

	public int ThemHoaDon(HoaDon hoaDon) {
		
		return hoaDonDAO.ThemHoaDon(hoaDon);
	}
	
	

}
