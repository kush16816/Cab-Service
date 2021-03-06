package com.capgemini.cabservice.service;

import java.util.ArrayList;
import java.util.List;

public class GenerateInvoice {
	double distance;
	int time;

	List<RideDetails> rideList = new ArrayList<RideDetails>();
	static int ratePerKm = 10;
	static int ratePerMinute = 1;

	public static double calculateFare(double distance, int time) {
		if (distance <= 1.0 && time <= 5)
			return 5.0;
		return (distance * ratePerKm + time * ratePerMinute);
	}

	public static double aggregateTotalFare(List<RideDetails> rideList) {
		double totalFare = 0;
		for (RideDetails rideDetails : rideList)
			totalFare += calculateFare(rideDetails.distance, rideDetails.time);
		return totalFare;
	}

	public static EnhancedInvoice getEnhacedInvoice(List<RideDetails> rideList) {
		EnhancedInvoice enhancedInvoice = new EnhancedInvoice();
		enhancedInvoice.setTotalFare(aggregateTotalFare(rideList));
		enhancedInvoice.setNoOfRides(rideList.size());
		enhancedInvoice.setAverageFare(enhancedInvoice.getTotalFare() / enhancedInvoice.getNoOfRides());
		return enhancedInvoice;
	}

	public static EnhancedInvoice getUserInvoice(List<UserInfo> rideRepository, int userId) {
		try {
			List<RideDetails> rideList = RideRepository.getUserRides(rideRepository, userId);
			EnhancedInvoice enhancedInvoice = getEnhacedInvoice(rideList);
			return enhancedInvoice;
		}
		catch (Exception e) {
			return null;
		}
	}
}
