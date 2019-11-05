package com.dainguyen.DAO;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.dainguyen.DAOImp.SanPhamImp;
import com.dainguyen.entity.SanPham;

@Repository
@Scope(proxyMode = ScopedProxyMode.TARGET_CLASS)
public class SanPhamDAO implements SanPhamImp {

	@Autowired
	SessionFactory sessionFactory;

	@SuppressWarnings("unchecked")
	@Transactional
	public List<SanPham> getDSSP(int spBD) {
		Session session = this.sessionFactory.getCurrentSession();
		List<SanPham> listSanPhams= new ArrayList<SanPham>();

		if (spBD < 0 ) {
			
			listSanPhams = (List<SanPham>) session.createQuery("from sanpham").getResultList();
					
		}	
		else {
			listSanPhams = (List<SanPham>) session.createQuery("from sanpham").setFirstResult(spBD)
					.setMaxResults(5).getResultList();
		}
		
		return listSanPhams;
	}

	@Transactional
	public SanPham getSPTheoMaSP(int maSP) {
		Session session = this.sessionFactory.getCurrentSession();
		String queryString = "from sanpham sp where sp.maSP=" + maSP;

		SanPham sanPham = (SanPham) session.createQuery(queryString).getSingleResult();

		return sanPham;
	}

	@Transactional
	public List<SanPham> getDSSPTheoDM(int maDM) {
		Session session = this.sessionFactory.getCurrentSession();
		String queryString = "from sanpham sp where sp.danhMucSP.maDM=" + maDM;

		@SuppressWarnings("unchecked")
		List<SanPham> listsptheoDM = (List<SanPham>) session.createQuery(queryString).getResultList();
		return listsptheoDM;
	}

	
	@Transactional
	public boolean XoaSPTheoMaSP(int maSP) {
		Session session = this.sessionFactory.getCurrentSession();
		SanPham sanPham= new SanPham();
		sanPham.setMaSP(maSP);
		session.delete(sanPham);
		return true;
	}
	
	

}
