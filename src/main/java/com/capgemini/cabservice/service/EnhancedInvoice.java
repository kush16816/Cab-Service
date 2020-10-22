package com.capgemini.cabservice.service;

public class EnhancedInvoice {

	private int noOfRides;
	private double averageFare;
	private double totalFare;
	
	public double getTotalFare() {
		return totalFare;
	}
	public void setTotalFare(double totalFare) {
		this.totalFare = totalFare;
	}
	public int getNoOfRides() {
		return noOfRides;
	}
	public void setNoOfRides(int noOfRides) {
		this.noOfRides = noOfRides;
	}
	public double getAverageFare() {
		return averageFare;
	}
	public void setAverageFare(double averageFare) {
		this.averageFare = averageFare;
	}

}
