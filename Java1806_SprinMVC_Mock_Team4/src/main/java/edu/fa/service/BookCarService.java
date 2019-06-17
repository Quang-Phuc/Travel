package edu.fa.service;

import java.util.List;

import edu.fa.model.bookCar;

public interface BookCarService {
	List<bookCar> findAllBookCars();

	bookCar save(bookCar bookCar);

	bookCar update(bookCar bookCar);

	public void deleteByBookCarId(int bookcarId);

	public bookCar findBookCarByCarId(int bookcarId);

	List<bookCar> findBookCarByCarCarTitle(String carTitle);

}
