package com.dainguyen.DAO;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.dainguyen.DAOImp.DanhMucSPImp;
import com.dainguyen.entity.DanhMucSP;


@Repository
@Scope(proxyMode = ScopedProxyMode.TARGET_CLASS)
public class DanhMucSPDAO implements DanhMucSPImp {

	
	@Autowired
	SessionFactory sessionFactory;
	
	@SuppressWarnings("unchecked")
	@Transactional
	public List<DanhMucSP> getDMSP() {
		
		Session session= sessionFactory.getCurrentSession();
		String query= "from danhmuc_sp";
		  List<DanhMucSP> getDanhMucSPs= (List<DanhMucSP>) session.createQuery(query).getResultList();
		// TODO Auto-generated method stub
		return getDanhMucSPs;
	}
 
}
