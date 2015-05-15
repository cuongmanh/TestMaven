package com.cuong.stock.bo;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.cuong.stock.model.Stock;
@Component
public interface IStockBo {
	void save(Stock stock);
	
	@Transactional
	void update(Stock stock);
	@Transactional
	void delete(Stock stock);
	@Transactional
	Stock findByStockCode(String stockCode);
}
