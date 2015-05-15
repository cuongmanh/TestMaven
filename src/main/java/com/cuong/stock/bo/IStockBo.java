package com.cuong.stock.bo;

import org.springframework.transaction.annotation.Transactional;

import com.cuong.stock.model.Stock;

public interface IStockBo {
	void save(Stock stock);
	
	@Transactional
	void update(Stock stock);
	@Transactional
	void delete(Stock stock);
	Stock findByStockCode(String stockCode);
}
