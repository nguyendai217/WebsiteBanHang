package com.dainguyen.DAO;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Repository;

import com.dainguyen.DAOImp.ChiTietHDImp;
import com.dainguyen.entity.ChiTietHD;
import com.dainguyen.entity.ChiTietHDId;

@Repository
@Scope(proxyMode = ScopedProxyMode.TARGET_CLASS)
public class ChiTietHDDAO implements ChiTietHDImp {

	@Autowired
	SessionFactory sessionFactory;

	@Transactional
	public boolean ThemChiTietHD(ChiTietHD chiTietHD) {
		Session session = sessionFactory.getCurrentSession();
		ChiTietHDId id= (ChiTietHDId) session.save(chiTietHD);

		if (null != id) {
			return true;

		} else {
			return false;
		}

	}

}
