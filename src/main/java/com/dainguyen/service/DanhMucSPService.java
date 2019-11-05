package com.dainguyen.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dainguyen.DAO.DanhMucSPDAO;
import com.dainguyen.DAOImp.DanhMucSPImp;
import com.dainguyen.entity.DanhMucSP;

@Service
public class DanhMucSPService implements DanhMucSPImp {

	@Autowired
	DanhMucSPDAO danhMucSPDAO;
	
	public List<DanhMucSP> getDMSP() {
		 return danhMucSPDAO.getDMSP();
		
	}

}
