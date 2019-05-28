package edu.fa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.fa.model.Travel;

@Repository
public interface TravelRepository extends JpaRepository<Travel, Integer> {
	public Travel findTravelByTravelId(int travelId);

	public List<Travel> findTravelByTitle(String title);

}
