package edu.fa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.fa.model.Planes;

@Repository
public interface PlanesRepository extends JpaRepository<Planes, Integer> {
	/*public Travel findTravelByTravelId(int travelId);*/

}
