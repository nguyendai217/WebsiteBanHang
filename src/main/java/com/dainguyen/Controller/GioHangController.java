package com.dainguyen.Controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.dainguyen.entity.ChiTietHD;
import com.dainguyen.entity.ChiTietHDId;
import com.dainguyen.entity.GioHang;
import com.dainguyen.entity.HoaDon;
import com.dainguyen.service.HoaDonService;
@Controller
@RequestMapping("giohang/")
public class GioHangController {
	
	@Autowired 
	HoaDonService hoaDonService;
	
	@GetMapping
	public String DefaultGioHang(HttpSession httpSession, ModelMap modelMap) {
		if (null != httpSession.getAttribute("listGioHang")) {
			@SuppressWarnings("unchecked")
			List<GioHang> gioHangs= (List<GioHang>) httpSession.getAttribute("listGioHang");
			modelMap.addAttribute("soluongSP",gioHangs.size());
			modelMap.addAttribute("giohangs", gioHangs);	
		}
		return "giohang";	
	}
	
	@PostMapping
	public String ThemHoaDon( @RequestParam String tenKH, @RequestParam String soDT,@RequestParam String diaChi,
			@RequestParam String hinhthucgiao,@RequestParam String ghichu, HttpSession httpSession) {
		
		if (null != httpSession.getAttribute("listGioHang")) {
			
			@SuppressWarnings("unchecked")
			List<GioHang> gioHangs= (List<GioHang>) httpSession.getAttribute("listGioHang");
			
			HoaDon hoaDon= new HoaDon();
			hoaDon.setTenKH(tenKH);
			hoaDon.setSoDT(soDT);
			hoaDon.setDiaChi(diaChi);
			hoaDon.setGhichu(ghichu);
			hoaDon.setHinhthucgiao(hinhthucgiao);			
			
			int idhoadon= hoaDonService.ThemHoaDon(hoaDon);
			if (idhoadon > 0) {
				
				for (GioHang gioHang : gioHangs) {
					
					ChiTietHDId chiTietHDId= new ChiTietHDId();
					chiTietHDId.setMaCTSP(gioHang.getMachitiet());
					chiTietHDId.setMaHD(hoaDon.getMaHD());
					
					ChiTietHD chiTietHD= new ChiTietHD();
					chiTietHD.setChiTietHDId(chiTietHDId);
					chiTietHD.setGiaTien(gioHang.getGiatien().toString());
					chiTietHD.setSoLuong(gioHang.getSoluong());					
				}			
			}
			else {
				System.out.println("Them That Bai !");	
			}
		}
		return "giohang";
	}

}
