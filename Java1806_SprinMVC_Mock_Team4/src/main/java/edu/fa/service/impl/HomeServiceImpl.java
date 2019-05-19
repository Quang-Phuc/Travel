package edu.fa.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.fa.model.Home;
import edu.fa.repository.HomeRepository;
import edu.fa.service.HomeService;
@Service
public class HomeServiceImpl  implements HomeService{
	
	@Autowired
	private HomeRepository homeRepository;

	
	@Override
	public Home save(Home home) {
		
		return homeRepository.save(home);
	}

	

	@Override
	public void deleteHomeByHomeId(int travelId) {
		// TODO Auto-generated method stub
		 homeRepository.delete(travelId);;
	}

	@Override
	public List<Home> findAllHome() {
		// TODO Auto-generated method stub
		return homeRepository.findAll();
	}



	@Override
	public Home update(Home home) {
		return homeRepository.save(home);
	}



	@Override
	public Home findHomeByHomeId(int HomeId) {
		// TODO Auto-generated method stub
		return homeRepository.findHomeByHomeId(HomeId);
	}



	@Override
	public Home findHomeByTravelIdTravelId(int travelId) {
		// TODO Auto-generated method stub
		return homeRepository.findHomeByTravelIdTravelId(travelId);
	}


	

	
	
}
