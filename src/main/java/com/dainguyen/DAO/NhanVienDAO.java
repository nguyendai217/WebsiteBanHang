package com.dainguyen.DAO;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.dainguyen.DAOImp.NhanVienImp;
import com.dainguyen.entity.NhanVien;

@Repository
@Scope(proxyMode = ScopedProxyMode.TARGET_CLASS)
public class NhanVienDAO implements NhanVienImp {

	@Autowired
	SessionFactory sessionFactory;

	@Transactional
	public boolean KiemTraLogin(String email, String password) {
		Session session = sessionFactory.getCurrentSession();
		try {
			NhanVien nVien = (NhanVien) session
					.createQuery("from nhanvien where email='" + email + "' and password='" + password + "'")
					.getSingleResult();

			if (nVien != null) {
				return true;
			} else {
				return false;
			}

		} catch (Exception e) {
			return false;
		}
	}

	@Transactional
	public boolean addNhanVien(NhanVien nhanVien) {
		Session session = sessionFactory.getCurrentSession();
		int id = (Integer) session.save(nhanVien);

		if (id > 0) {
			return true;
		} else {
			return false;
		}

	}

}
