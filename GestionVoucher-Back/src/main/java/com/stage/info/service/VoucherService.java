package com.stage.info.service;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.stage.info.generator.CodeConfig;
import com.stage.info.generator.CodeConfig.Charset;
import com.stage.info.generator.VoucherCodes;
import com.stage.info.model.Voucher;
import com.stage.info.repository.CategorieRepository;
import com.stage.info.repository.VoucherRepository;

@Service
public class VoucherService {

	@Autowired
	VoucherRepository voucherRepository;
	@Autowired
	private CategorieRepository catRepository;
	

	// Add Voucher :

	public Voucher voucherSubmit(Voucher voucher) {
		CodeConfig config = CodeConfig.length(8).withCharset(Charset.NUMBERS);
		String code = VoucherCodes.generate(config);
		voucher.setType(voucher.getType());
		voucher.setNoVoucher(code);
		voucher.setCreatedate(new Date());
		voucher.setUpdateDate(new Date());
		return voucherRepository.save(voucher);
		
	}

	// View Voucher :
	public ResponseEntity<Voucher> getVoucher(long idvch) {
		Voucher voucher = voucherRepository.findById(idvch).get();
		return ResponseEntity.ok(voucher);
	}

	// View Vouchers List:

	public List<Voucher> getVouchers() {
		return voucherRepository.findAll();
	}

	// Update Voucher :

	public ResponseEntity<Voucher> updateVoucher(long id, Voucher voucherDetails) {

		Voucher voucher = voucherRepository.getById(id);
		voucher.setTitre(voucherDetails.getTitre());
		voucher.setDescVoucher(voucherDetails.getDescVoucher());
		voucher.setPrixVoucher(voucherDetails.getPrixVoucher());
		voucher.setDateExp(voucherDetails.getDateExp());
		voucher.setUpdateDate(new Date());
		Voucher updatedVoucher = voucherRepository.save(voucher);
		return ResponseEntity.ok(updatedVoucher);
	}

	// - Delete Voucher :

	public ResponseEntity<Map<String, Boolean>> deleteVoucher(Long id){
		Voucher voucher = voucherRepository.getById(id);
		voucherRepository.delete(voucher);
		Map<String, Boolean> response = new HashMap<>();
		response.put("deleted", Boolean.TRUE);
		return ResponseEntity.ok(response);
	}
	


}
