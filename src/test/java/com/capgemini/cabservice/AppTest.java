package com.capgemini.cabservice;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.capgemini.cabservice.service.GenerateInvoice;

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

}
