package com.capgemini.cabservice;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.capgemini.cabservice.service.EnhancedInvoice;
import com.capgemini.cabservice.service.GenerateInvoice;
import com.capgemini.cabservice.service.RideDetails;

public class AppTest {
	@Test
	public void testToCalculateTotalFare() {
		double totalFare = GenerateInvoice.calculateFare(2.0, 5);
		assertEquals(25.0, totalFare, 0);
	}

	@Test
	public void testForMinimumFare() {
		double totalFare = GenerateInvoice.calculateFare(0.7, 4);
		assertEquals(5.0, totalFare, 0);
	}

	@Test
	public void testForMultipleRideFare() {
		List<RideDetails> rideList = new ArrayList<RideDetails>();
		rideList.add(new RideDetails(0.6, 4));
		rideList.add(new RideDetails(7, 16));
		rideList.add(new RideDetails(12, 25));
		rideList.add(new RideDetails(0.7, 6));
		rideList.add(new RideDetails(8, 10));
		double totalFare = GenerateInvoice.aggregateTotalFare(rideList);
		assertEquals(339.0, totalFare, 0);
	}

	@Test
	public void testForFareOfEnhancedInvoice() {
		List<RideDetails> rideList = new ArrayList<RideDetails>();
		rideList.add(new RideDetails(0.6, 4));
		rideList.add(new RideDetails(7, 16));
		rideList.add(new RideDetails(12, 25));
		rideList.add(new RideDetails(0.7, 6));
		rideList.add(new RideDetails(8, 10));
		EnhancedInvoice invoice = GenerateInvoice.getEnhacedInvoice(rideList);
		double totalFare = invoice.getTotalFare();
		assertEquals(339.0, totalFare, 0);
	}

	@Test
	public void testForNoOfRidesOfEnhancedInvoice() {
		List<RideDetails> rideList = new ArrayList<RideDetails>();
		rideList.add(new RideDetails(0.6, 4));
		rideList.add(new RideDetails(7, 16));
		rideList.add(new RideDetails(12, 25));
		rideList.add(new RideDetails(0.7, 6));
		rideList.add(new RideDetails(8, 10));
		EnhancedInvoice invoice = GenerateInvoice.getEnhacedInvoice(rideList);
		int noOfRides = invoice.getNoOfRides();
		assertEquals(5, noOfRides, 0);
	}

	@Test
	public void testForAverageFareOfEnhancedInvoice() {
		List<RideDetails> rideList = new ArrayList<RideDetails>();
		rideList.add(new RideDetails(0.6, 4));
		rideList.add(new RideDetails(7, 16));
		rideList.add(new RideDetails(12, 25));
		rideList.add(new RideDetails(0.7, 6));
		rideList.add(new RideDetails(8, 10));
		EnhancedInvoice invoice = GenerateInvoice.getEnhacedInvoice(rideList);
		double averageFare = invoice.getAverageFare();
		assertEquals(67.8, averageFare, 0);
	}
}
