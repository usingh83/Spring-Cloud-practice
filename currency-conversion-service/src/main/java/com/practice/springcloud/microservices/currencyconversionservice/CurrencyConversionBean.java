package com.practice.springcloud.microservices.currencyconversionservice;

public class CurrencyConversionBean {
private int id;
private String from;
private String to;
private int conversionMultiplier;
private int quantity;
private int TotalCalculatedAmount;
private int port;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getFrom() {
	return from;
}
public void setFrom(String from) {
	this.from = from;
}
public String getTo() {
	return to;
}
public void setTo(String to) {
	this.to = to;
}
public int getConversionMultiplier() {
	return conversionMultiplier;
}
public void setConversionMultiplier(int conversionMultiplier) {
	this.conversionMultiplier = conversionMultiplier;
}
public int getQuantity() {
	return quantity;
}
public void setQuantity(int quantity) {
	this.quantity = quantity;
}
public int getTotalCalculatedAmount() {
	return TotalCalculatedAmount;
}
public void setTotalCalculatedAmount(int totalCalculatedAmount) {
	TotalCalculatedAmount = totalCalculatedAmount;
}
public int getPort() {
	return port;
}
public void setPort(int port) {
	this.port = port;
}
public CurrencyConversionBean() {
	
}
public CurrencyConversionBean(int id, String from, String to, int conversionMultiplier, int quantity,
		int totalCalculatedAmount, int port) {
	super();
	this.id = id;
	this.from = from;
	this.to = to;
	this.conversionMultiplier = conversionMultiplier;
	this.quantity = quantity;
	TotalCalculatedAmount = totalCalculatedAmount;
	this.port = port;
}

}
