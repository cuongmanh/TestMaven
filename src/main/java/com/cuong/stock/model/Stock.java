package com.cuong.stock.model;

import java.io.Serializable;

import org.springframework.stereotype.Component;
@Component
public class Stock implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long stockId;
	private String stockCode;
	private String stockName;
	public String getStockCode() {
		return stockCode;
	}
	public void setStockCode(String stockCode) {
		this.stockCode = stockCode;
	}
	public Long getStockId() {
		return stockId;
	}
	public void setStockId(Long stockId) {
		this.stockId = stockId;
	}
	public String getStockName() {
		return stockName;
	}
	public void setStockName(String stockName) {
		this.stockName = stockName;
	}
}
