package com.dainguyen.Controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dainguyen.entity.DanhMucSP;
import com.dainguyen.entity.SanPham;
import com.dainguyen.service.DanhMucSPService;
import com.dainguyen.service.SanPhamService;

@Controller
@RequestMapping("/")
public class TrangChuController {
	
	@Autowired
	SanPhamService sanPhamService;
	@Autowired
	DanhMucSPService danhMucSPService;
	
	@GetMapping
	@Transactional
	public String getTrangchu(String user,ModelMap modelMap , HttpSession httpSession) {
		if (httpSession.getAttribute("user")!= null) {
			String email= (String) httpSession.getAttribute("user");
			modelMap.addAttribute("name",email);
		}
		
		List<SanPham> listSanPhams=sanPhamService.getDSSP(0);
		modelMap.addAttribute("listSP", listSanPhams);
		
		List<DanhMucSP> danhMucSPs=danhMucSPService.getDMSP(); 
		modelMap.addAttribute("dmsp", danhMucSPs);
		return "trangchu";
	}
	
}
