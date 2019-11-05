package com.dainguyen.Controller;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.dainguyen.entity.NhanVien;
import com.dainguyen.service.NhanVienService;

@Controller
@RequestMapping("dangnhap/")
public class DangNhapController {

	@Autowired
	NhanVienService nhanVienService;
	@GetMapping
	public String getDangNhap() {
		return "dangnhap";
	}

	@PostMapping
	public String signIn(@RequestParam String username, @RequestParam String email, @RequestParam String password,
			@RequestParam String repassword,ModelMap modelMap) {

		boolean ktemail= validate(email);
		if (ktemail) {
			if (password.equals(repassword)) {
				NhanVien nv= new NhanVien();
				nv.setEmail(email);
				nv.setUsername(username);
				nv.setPassword(password);	
				
				nhanVienService.addNhanVien(nv);
			}
			else {
				modelMap.addAttribute("result", "Password không trùng nhau !");
			}
		}
		else {
			modelMap.addAttribute("result", "Email không đúng định dạng !");
			
		}
		return "dangnhap";
	}

	public static final Pattern VALID_EMAIL_ADDRESS_REGEX = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$",
			Pattern.CASE_INSENSITIVE);

	public static boolean validate(String emailStr) {
		Matcher matcher = VALID_EMAIL_ADDRESS_REGEX.matcher(emailStr);
		return matcher.find();
	}

}
