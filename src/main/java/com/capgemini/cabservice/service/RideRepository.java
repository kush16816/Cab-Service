package com.capgemini.cabservice.service;

import java.util.ArrayList;
import java.util.List;

public class RideRepository {
	List<UserInfo> rideRepository = new ArrayList<UserInfo>();

	public static List<UserInfo> addUser(List<UserInfo> rideRepository, UserInfo userInfo) {
		rideRepository.add(userInfo);
		return rideRepository;
	}

	public static List<RideDetails> getUserRides(List<UserInfo> rideRepository, int userId) {
		for(UserInfo userInfo : rideRepository) {
			if(userInfo.userId==userId)
				return userInfo.rideList;
		}
		return null;
	}
}
