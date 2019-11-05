package com.dainguyen.DAOImp;

import java.util.List;

import com.dainguyen.entity.SanPham;

public interface SanPhamImp {
	List<SanPham>getDSSP(int spBD);
	SanPham getSPTheoMaSP(int maSP);
	List<SanPham> getDSSPTheoDM(int maDM);
	boolean XoaSPTheoMaSP(int maSP);	
}
