package com.practice.springcloud.microservices.limitsservice;

public class LimitConfiguration {
private int minimum;
private int maximum;
public int getMinimum() {
	return minimum;
}
public void setMinimum(int minimum) {
	this.minimum = minimum;
}
public int getMaximum() {
	return maximum;
}
public void setMaximum(int maximum) {
	this.maximum = maximum;
}
@Override
public String toString() {
	return "LimitConfiguration [minimum=" + minimum + ", maximum=" + maximum + "]";
}
public LimitConfiguration(int minimum, int maximum) {
	super();
	this.minimum = minimum;
	this.maximum = maximum;
}

}
