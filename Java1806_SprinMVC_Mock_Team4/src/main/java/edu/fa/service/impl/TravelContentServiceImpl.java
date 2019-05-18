package edu.fa.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.fa.model.TravelContent;
import edu.fa.repository.TravelContentRepository;
import edu.fa.service.TravelContentService;
@Service
public class TravelContentServiceImpl  implements TravelContentService{
	@Autowired
	private TravelContentRepository travelContentRepository;

	@Override
	public List<TravelContent> findAllTravelContent() {
		// TODO Auto-generated method stub
		return travelContentRepository.findAll();
	}

	@Override
	public TravelContent save(TravelContent travelContent) {
		// TODO Auto-generated method stub
		return travelContentRepository.save(travelContent);
	}

	@Override
	public TravelContent update(TravelContent travelContent) {
		// TODO Auto-generated method stub
		return travelContentRepository.save(travelContent);
	}

	@Override
	public void deleteTravelContentByTravelContentId(int travelContentId) {
		travelContentRepository.delete(travelContentId);
		
	}

	@Override
	public TravelContent findTravelContentByTravelContentId(int travelContentId) {
		// TODO Auto-generated method stub
		return travelContentRepository.findTravelContentByTravelContentId(travelContentId);
	}

	@Override
	public List<TravelContent> findTravelContentByTravelTravelId(int travelId) {
		// TODO Auto-generated method stub
		return travelContentRepository.findTravelContentByTravelTravelId(travelId);
		
	}


	


	

	
	
	
}
