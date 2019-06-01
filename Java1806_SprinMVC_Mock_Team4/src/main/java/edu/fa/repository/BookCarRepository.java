package edu.fa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.fa.model.bookCar;

@Repository
public interface BookCarRepository extends JpaRepository<bookCar, Integer> {
	public bookCar findbookCarByCarId(int bookcarId);

}
