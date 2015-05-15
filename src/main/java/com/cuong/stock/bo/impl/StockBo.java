package com.cuong.stock.bo.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.cuong.stock.bo.IStockBo;
import com.cuong.stock.dao.impl.StockDao;
import com.cuong.stock.model.Stock;
@Component("stockBo")
public class StockBo implements IStockBo {
	@Autowired
	StockDao stockDao;
	
	
	public StockDao getStockDao() {
		return stockDao;
	}

	public void setStockDao(StockDao stockDao) {
		this.stockDao = stockDao;
	}

	@Override
	@Transactional
	public void save(Stock stock) {
		stockDao.save(stock);

	}

	public void update(Stock stock) {
		stockDao.update(stock);

	}

	public void delete(Stock stock) {
		stockDao.delete(stock);
	}

	public Stock findByStockCode(String stockCode) {
		return stockDao.findByStockCode(stockCode);
	}

}
