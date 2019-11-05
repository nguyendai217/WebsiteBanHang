package com.dainguyen.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dainguyen.entity.SanPham;
import com.dainguyen.service.SanPhamService;

@Controller
@RequestMapping("admin/addsanpham")
public class AddSanPhamController {
	
	@Autowired
	SanPhamService sanPhamService;
	@GetMapping
	public String Default(ModelMap modelMap) {
		
		List<SanPham> listSanPhams= sanPhamService.getDSSP(0);
		modelMap.addAttribute("listSP", listSanPhams);
		
		List<SanPham> allSanPhams= sanPhamService.getDSSP(-1);
		double tongpage= Math.ceil((double)allSanPhams.size()/5);
		modelMap.addAttribute("allSP", allSanPhams);
		modelMap.addAttribute("tongpage", tongpage);
		return "addsanpham";
	}
}
