package edu.fa.service;

import java.util.List;

import edu.fa.model.TravelContent;

public interface TravelContentService {
	
	List<TravelContent> findAllTravelContent();

	TravelContent save(TravelContent travelContent);

	TravelContent update(TravelContent travelContent);

	public void deleteTravelContentByTravelContentId(int travelContentId);
	
	public TravelContent findTravelContentByTravelContentId(int travelContentId);
	
	List<TravelContent> findTravelContentByTravelTravelId(int travelId);
}
