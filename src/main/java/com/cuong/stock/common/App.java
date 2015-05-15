package com.cuong.stock.common;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cuong.stock.bo.IStockBo;
import com.cuong.stock.model.Stock;

public class App {
	public static void main(String[]args) {
		ApplicationContext appContext = new ClassPathXmlApplicationContext("config/BeanLocations.xml");
		IStockBo stockBo = (IStockBo)appContext.getBean("stockBo");
		
		Stock stock = new Stock();
		stock.setStockCode("test");
		stock.setStockName("test");
		
		stockBo.save(stock);
		
		Stock stock2 = stockBo.findByStockCode("test");
		stock2.setStockName("test2");
		
		stockBo.update(stock2);
		
		stockBo.delete(stock2);
	}
}
