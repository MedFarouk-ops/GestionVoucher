package com.stage.info.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stage.info.model.Voucher;
import com.stage.info.service.VoucherService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/vouchers")
public class VoucherController {

	@Autowired
	private VoucherService service;

	// - Add Voucher :

	@PostMapping("")
	public Voucher create_voucher(@RequestBody Voucher voucher) {
		return service.voucherSubmit(voucher);
	}
	
	// - Show Voucher:
	@GetMapping("/{id}")
	public ResponseEntity<Voucher> getSingleVoucher(@PathVariable long id) {
		return service.getVoucher(id);
	}

	// Voucher List
	@GetMapping("")
	public List<Voucher> getAllVouchers() {
		return service.getVouchers();
	}

	// Edit Voucher :

	@PutMapping("/{id}")
	public ResponseEntity<Voucher> updateVoucher(@PathVariable long id, @RequestBody Voucher voucherDetails) {
		return service.updateVoucher(id, voucherDetails);
	}

	// - Delete Voucher :

	@DeleteMapping("/{id}")
	public ResponseEntity<Map<String, Boolean>> deleteVoucher(@PathVariable Long id) {
		return service.deleteVoucher(id);
	}

}
