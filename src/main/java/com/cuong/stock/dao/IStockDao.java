package com.cuong.stock.dao;

import org.springframework.stereotype.Component;

import com.cuong.stock.model.Stock;

public interface IStockDao {
	void save(Stock stock);
	void update(Stock stock);
	void delete(Stock stock);
	Stock findByStockCode(String stockCode);
}
