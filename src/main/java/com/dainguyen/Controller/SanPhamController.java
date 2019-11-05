package com.dainguyen.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dainguyen.entity.DanhMucSP;
import com.dainguyen.entity.SanPham;
import com.dainguyen.service.DanhMucSPService;
import com.dainguyen.service.SanPhamService;

@Controller 
@RequestMapping("sanpham")
public class SanPhamController {
	
	@Autowired
	DanhMucSPService danhMucSPService;
	
	@Autowired
	SanPhamService sanPhamService;
	
	@GetMapping("/{id}/{tenDM}")
	public String Default(ModelMap modelMap,@PathVariable int id,@PathVariable String tenDM ) {
		
		List<DanhMucSP> danhMucSPs=danhMucSPService.getDMSP(); 
		modelMap.addAttribute("dmsp", danhMucSPs);
		
		List<SanPham> listSPTheoDM= sanPhamService.getDSSPTheoDM(id);
		modelMap.addAttribute("tenDM", tenDM);
		modelMap.addAttribute("listSPDM", listSPTheoDM);
		
		return "sanpham";
	}
	
	
}
