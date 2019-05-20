package com.cdac.web.model;

import java.io.Serializable;

public class Product implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -2384852988061189262L;
	int proId;
	String proName;
	double proCost;
	
	public Product(int proId, String proName, double proCost) {
		super();
		this.proId = proId;
		this.proName = proName;
		this.proCost = proCost;
	}

	public int getProId() {
		return proId;
	}

	public void setProId(int proId) {
		this.proId = proId;
	}

	public String getProName() {
		return proName;
	}

	public void setProName(String proName) {
		this.proName = proName;
	}

	public double getProCost() {
		return proCost;
	}

	public void setProCost(double proCost) {
		this.proCost = proCost;
	}

	@Override
	public String toString() {
		return "Product [proId=" + proId + ", proName=" + proName + ", proCost=" + proCost + "]";
	}
	
	
}
