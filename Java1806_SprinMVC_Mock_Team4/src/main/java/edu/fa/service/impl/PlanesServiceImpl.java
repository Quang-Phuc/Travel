package edu.fa.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.fa.model.Planes;
import edu.fa.repository.PlanesRepository;
import edu.fa.service.PlanesService;
@Service
public class PlanesServiceImpl  implements PlanesService
{
	
	@Autowired
	private PlanesRepository planesRepository;

	@Override
	public List<Planes> findAllPlanes() {
		
		 return planesRepository.findAll();
	}

	@Override
	public Planes save(Planes planes) {
		// TODO Auto-generated method stub
		return planesRepository.save(planes);
	}

	@Override
	public void deletePlanesByPlanesId(int planesId) {
		planesRepository.delete(planesId);
		
	}

			
	
	
	
	}
