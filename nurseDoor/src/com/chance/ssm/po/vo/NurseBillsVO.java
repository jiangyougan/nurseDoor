package com.chance.ssm.po.vo;

import java.math.BigDecimal;
import java.util.List;

public class NurseBillsVO { 
	
	private BigDecimal totalPriceWeek1;
	private BigDecimal totalPriceWeek2;
	private BigDecimal totalPriceWeek3;
	private BigDecimal totalPriceWeek4;
	
	private String weekRange1;
	private String weekRange2;
	private String weekRange3;
	private String weekRange4;
	
	private BigDecimal totalPrice;
	
	private List<NurseBillsOrderVO> nurseOrders;
	
	public BigDecimal getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(BigDecimal totalPrice) {
		this.totalPrice = totalPrice;
	}
	public List<NurseBillsOrderVO> getNurseOrders() {
		return nurseOrders;
	}
	public void setNurseOrders(List<NurseBillsOrderVO> nurseOrders) {
		this.nurseOrders = nurseOrders;
	}
	public BigDecimal getTotalPriceWeek1() {
		return totalPriceWeek1;
	}
	public void setTotalPriceWeek1(BigDecimal totalPriceWeek1) {
		this.totalPriceWeek1 = totalPriceWeek1;
	}
	public BigDecimal getTotalPriceWeek2() {
		return totalPriceWeek2;
	}
	public void setTotalPriceWeek2(BigDecimal totalPriceWeek2) {
		this.totalPriceWeek2 = totalPriceWeek2;
	}
	public BigDecimal getTotalPriceWeek3() {
		return totalPriceWeek3;
	}
	public void setTotalPriceWeek3(BigDecimal totalPriceWeek3) {
		this.totalPriceWeek3 = totalPriceWeek3;
	}
	public BigDecimal getTotalPriceWeek4() {
		return totalPriceWeek4;
	}
	public void setTotalPriceWeek4(BigDecimal totalPriceWeek4) {
		this.totalPriceWeek4 = totalPriceWeek4;
	}
	public String getWeekRange1() {
		return weekRange1;
	}
	public void setWeekRange1(String weekRange1) {
		this.weekRange1 = weekRange1;
	}
	public String getWeekRange2() {
		return weekRange2;
	}
	public void setWeekRange2(String weekRange2) {
		this.weekRange2 = weekRange2;
	}
	public String getWeekRange3() {
		return weekRange3;
	}
	public void setWeekRange3(String weekRange3) {
		this.weekRange3 = weekRange3;
	}
	public String getWeekRange4() {
		return weekRange4;
	}
	public void setWeekRange4(String weekRange4) {
		this.weekRange4 = weekRange4;
	}
}
