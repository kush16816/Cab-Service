package com.capgemini.cabservice.service;

import java.util.ArrayList;
import java.util.List;

public class UserInfo {
	int userId;
	List<RideDetails> rideList = new ArrayList<RideDetails>();
	
	public UserInfo(int userId, List<RideDetails> rideList) {
		this.userId = userId;
		this.rideList = rideList;
	}
}
