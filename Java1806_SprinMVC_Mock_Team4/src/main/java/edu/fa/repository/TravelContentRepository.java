package edu.fa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.fa.model.TravelContent;

@Repository
public interface TravelContentRepository extends JpaRepository<TravelContent, Integer> {

	public TravelContent findTravelContentByTravelContentId(int travelContentId);
	
	List<TravelContent> findTravelContentByTravelTravelId(int travelId);

}
