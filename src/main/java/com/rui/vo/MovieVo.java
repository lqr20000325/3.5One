package com.rui.vo;

import com.rui.domain.Movie;

public class MovieVo extends Movie{
	private String startDate;
	private String endDate;
	private Double startPrice;
	private Double endPrice;
	private String startLongtime;
	private String endLongtime;
	
	private String orderField;//ÅÅÐòµÄ×Ö¶Î£»
	private String orderMethod;//ÅÅÐòµÄË³Ðò£»
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	public Double getStartPrice() {
		return startPrice;
	}
	public void setStartPrice(Double startPrice) {
		this.startPrice = startPrice;
	}
	public Double getEndPrice() {
		return endPrice;
	}
	public void setEndPrice(Double endPrice) {
		this.endPrice = endPrice;
	}
	public String getStartLongtime() {
		return startLongtime;
	}
	public void setStartLongtime(String startLongtime) {
		this.startLongtime = startLongtime;
	}
	public String getEndLongtime() {
		return endLongtime;
	}
	public void setEndLongtime(String endLongtime) {
		this.endLongtime = endLongtime;
	}
	public String getOrderField() {
		return orderField;
	}
	public void setOrderField(String orderField) {
		this.orderField = orderField;
	}
	public String getOrderMethod() {
		return orderMethod;
	}
	public void setOrderMethod(String orderMethod) {
		this.orderMethod = orderMethod;
	}
	
}
