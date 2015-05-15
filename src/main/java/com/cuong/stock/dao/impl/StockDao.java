package com.cuong.stock.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

import com.cuong.stock.dao.IStockDao;
import com.cuong.stock.model.Stock;

public class StockDao extends HibernateDaoSupport implements IStockDao {

	public void save(Stock stock) {
		getHibernateTemplate().save(stock);

	}

	
	public void update(Stock stock) {
		getHibernateTemplate().update(stock);

	}


	public void delete(Stock stock) {
		getHibernateTemplate().delete(stock);

	}


	public Stock findByStockCode(String stockCode) {
		List stocks = getHibernateTemplate().find("from Stock where stockCode=?",stockCode);
		return (Stock)stocks.get(0);
	}

}
