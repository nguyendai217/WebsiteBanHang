package com.dainguyen.Controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.dainguyen.entity.DanhMucSP;
import com.dainguyen.entity.GioHang;
import com.dainguyen.entity.SanPham;
import com.dainguyen.service.DanhMucSPService;
import com.dainguyen.service.SanPhamService;

@Controller
@RequestMapping("/chitiet/")
@SessionAttributes("listGioHang")
public class ChiTietController {
	
	@Autowired
	SanPhamService sanPhamService;
	
	@Autowired
	DanhMucSPService danhMucSPService;
	
	@GetMapping("{maSP}")
	public String getChiTiet(@PathVariable int maSP, ModelMap modelMap, HttpSession httpSession){
		SanPham sanPham =sanPhamService.getSPTheoMaSP(maSP);
		
		
		if (null != httpSession.getAttribute("listGioHang")) {
			@SuppressWarnings("unchecked")
			List<GioHang> gioHangs= (List<GioHang>) httpSession.getAttribute("listGioHang");
			modelMap.addAttribute("Giohang",gioHangs.size());
		}
		
		List<DanhMucSP> danhMucSPs=danhMucSPService.getDMSP(); 
		modelMap.addAttribute("getsp",sanPham);
		modelMap.addAttribute("dmsp", danhMucSPs);
		
		
		return "chitiet";
	}
}
