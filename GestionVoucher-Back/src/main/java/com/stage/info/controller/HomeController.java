package com.stage.info.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stage.info.model.Voucher;
import com.stage.info.service.VoucherService;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/home")
public class HomeController {

	VoucherService voucherService ;
	
	public String underConst = " cette phase est En cours de developpement ";

	// Voucher List
	@GetMapping("")
	public List<Voucher> getAllVouchers() {
		return voucherService.getVouchers();
	}

	@GetMapping("/all")
	public String allAccess() {
		return underConst;
	}

	@GetMapping("/user")
	public String userAccess() {
		return underConst;
	}

	@GetMapping("/mod")
	public String moderatorAccess() {
		return underConst;
	}

	@GetMapping("/admin")
	public String adminAccess() {
		return underConst;
	}

}
