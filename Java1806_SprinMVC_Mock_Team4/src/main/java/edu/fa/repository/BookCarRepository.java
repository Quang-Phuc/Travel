package edu.fa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.fa.model.bookCar;

@Repository
public interface BookCarRepository extends JpaRepository<bookCar, Integer> {
	public bookCar findBookCarByBookCarId(int bookcarId);

	public List<bookCar> findBookCarByCarCarTitle(String carTitle);

}
