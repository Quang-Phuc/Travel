package edu.fa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.fa.model.Home;

@Repository
public interface HomeRepository extends JpaRepository<Home, Integer> {
	public Home findHomeByHomeId(int HomeId);
	
	public Home findHomeByTravelIdTitle(String Title);
	

	

}
