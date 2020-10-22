package com.capgemini.cabservice.service;

public class GenerateInvoice {
	double distance;
	int time;
	
	static int ratePerKm = 10;
	static int ratePerMinute = 1;

	public static double calculateFare(double distance, int time) {
		if(distance <= 1.0 && time <= 5)
			return 5.0;
		return (distance*ratePerKm + time*ratePerMinute);
	}
}
