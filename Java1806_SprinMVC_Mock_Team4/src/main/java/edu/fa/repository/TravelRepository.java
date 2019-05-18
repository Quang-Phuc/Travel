package edu.fa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.fa.model.Home;
import edu.fa.model.Travel;

@Repository
public interface TravelRepository extends JpaRepository<Travel, Integer> {
	public Travel findTravelByTravelId(int travelId);

}
