package edu.fa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.fa.model.Car;

@Repository
public interface CarRepository extends JpaRepository<Car, Integer> {
	public Car findCarByCarId(int carId );

}
