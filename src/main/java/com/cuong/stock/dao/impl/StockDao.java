package com.cuong.stock.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;
import org.springframework.stereotype.Component;

import com.cuong.stock.dao.IStockDao;
import com.cuong.stock.model.Stock;
@Component
public class StockDao implements IStockDao {
	@Autowired
	private SessionFactory sessionFactory;
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}


	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}


	public void save(Stock stock) {
		sessionFactory.getCurrentSession().save(stock);
	}

	
	public void update(Stock stock) {
		sessionFactory.getCurrentSession().update(stock);

	}


	public void delete(Stock stock) {
		sessionFactory.getCurrentSession().delete(stock);

	}


	public Stock findByStockCode(String stockCode) {
		List stocks = sessionFactory.getCurrentSession().
				createQuery("from Stock s where s.stockCode='" + stockCode + "'").list();
		return (Stock)stocks.get(0);
	}

}
