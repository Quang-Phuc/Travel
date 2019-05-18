package edu.fa.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.fa.model.Home;
import edu.fa.model.Travel;
import edu.fa.repository.TravelRepository;
import edu.fa.service.TravelService;
@Service
public class TravelServiceImpl  implements TravelService{

	@Autowired
	private TravelRepository travelRepository;
	@Override
	public List<Travel> findAllTravel() {
		
		return travelRepository.findAll();
	}

	@Override
	public Travel save(Travel travel) {
	
		return travelRepository.save(travel);
	}

	@Override
	public Travel update(Travel travel) {
		// TODO Auto-generated method stub
		return travelRepository.save(travel);
	}

	@Override
	public void deleteTravelBytravelId(int travelId) {
		travelRepository.delete(travelId);
		
	}

	@Override
	public Travel findTravelBytravelId(int travelId) {
		// TODO Auto-generated method stub
		return travelRepository.findTravelByTravelId(travelId);
	}

	


	

	
	
	
}
