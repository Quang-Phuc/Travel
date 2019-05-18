package edu.fa.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.fa.model.Car;
import edu.fa.repository.CarRepository;
import edu.fa.service.CarService;

@Service
public class CarServiceImpl implements CarService {

	@Autowired
	private CarRepository carRepository;

	@Override
	public List<Car> findAllCar() {
		// TODO Auto-generated method stub
		return carRepository.findAll();
	}

	@Override
	public Car save(Car car) {
		// TODO Auto-generated method stub
		return carRepository.save(car);
	}

	@Override
	public Car update(Car car) {
		// TODO Auto-generated method stub
		return carRepository.save(car);
	}

	@Override
	public void deleteByCarId(int carId) {
		carRepository.delete(carId);
		
	}

	@Override
	public Car findCarByCarId(int carId) {
		// TODO Auto-generated method stub
		return carRepository.findCarByCarId(carId);
	}
	

	
}
