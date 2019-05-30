package edu.fa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.fa.model.Home;

@Repository
public interface HomeRepository extends JpaRepository<Home, Integer> {
	public Home findHomeByHomeId(int HomeId);

	public List<Home> findHomeByTravelIdTitle(String Title);

}
