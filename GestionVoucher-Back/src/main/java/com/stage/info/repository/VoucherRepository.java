package com.stage.info.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.stage.info.model.Voucher;

public interface VoucherRepository extends JpaRepository<Voucher, Long> {
	@Query("select v from Voucher v where v.noVoucher=?1")
	Voucher findByNoVoucher(String noVoucher);
}
