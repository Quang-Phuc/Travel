package edu.fa.service;

import java.util.List;

import edu.fa.model.Planes;

public interface PlanesService {
	List<Planes> findAllPlanes();

	Planes save(Planes planes);


	public void deletePlanesByPlanesId(int planesId);
	
	

}
