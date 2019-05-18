package edu.fa.service;

import java.util.List;

import edu.fa.model.Car;

public interface CarService {
	List<Car> findAllCar();

	Car save(Car car);

	Car update(Car car);

	public void deleteByCarId(int carId);

	public Car findCarByCarId(int carId);

}
