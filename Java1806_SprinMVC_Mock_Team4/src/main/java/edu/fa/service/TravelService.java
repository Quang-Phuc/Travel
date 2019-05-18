package edu.fa.service;

import java.util.List;

import edu.fa.model.Home;
import edu.fa.model.Travel;

public interface TravelService {
	
	List<Travel> findAllTravel();

	Travel save(Travel travel);

	Travel update(Travel travel);

	public void deleteTravelBytravelId(int travelId);
	
	public Travel findTravelBytravelId(int travelId);
}
