package edu.fa.service;

import java.util.List;

import edu.fa.model.Home;

public interface HomeService {
	List<Home> findAllHome();

	Home save(Home home);

	Home update(Home home);

	public void deleteHomeByHomeId(int travelId);

	public Home findHomeByHomeId(int HomeId);

	public List<Home> findHomeByTravelIdTitle(String Title);

}
