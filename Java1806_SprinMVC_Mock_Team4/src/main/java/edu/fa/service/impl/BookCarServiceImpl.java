package edu.fa.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.fa.model.bookCar;
import edu.fa.repository.BookCarRepository;
import edu.fa.service.BookCarService;

@Service
public class BookCarServiceImpl implements BookCarService {

	@Autowired
	private BookCarRepository bookCarRepository;

	@Override
	public List<bookCar> findAllBookCars() {
		// TODO Auto-generated method stub
		return bookCarRepository.findAll();
	}

	@Override
	public bookCar save(bookCar bookCar) {
		// TODO Auto-generated method stub
		return bookCarRepository.save(bookCar);
	}

	@Override
	public bookCar update(bookCar bookCar) {
		// TODO Auto-generated method stub
		return save(bookCar);
	}

	@Override
	public void deleteByBookCarId(int bookcarId) {
		bookCarRepository.delete(bookcarId);

	}

	@Override
	public bookCar findBookCarByCarId(int bookcarId) {
		// TODO Auto-generated method stub
		return bookCarRepository.findbookCarByCarId(bookcarId);
	}

}
