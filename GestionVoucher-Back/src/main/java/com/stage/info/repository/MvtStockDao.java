package com.stage.info.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.stage.info.model.MvtStock;


public interface MvtStockDao extends JpaRepository<MvtStock, Long> {

}
