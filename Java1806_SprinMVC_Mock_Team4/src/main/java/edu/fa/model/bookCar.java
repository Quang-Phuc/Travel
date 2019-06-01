package edu.fa.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class bookCar {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int bookCarId;
	private String name;
	private int personNumber;
	@Temporal(TemporalType.DATE)
	private Date timeGo;
	private String place;
	private int phoneNumber;
	@ManyToOne
	@JoinColumn(name = "carId", nullable = false)
	private Car car;

	public int getBookCarId() {
		return bookCarId;
	}

	public void setBookCarId(int bookCarId) {
		this.bookCarId = bookCarId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPersonNumber() {
		return personNumber;
	}

	public void setPersonNumber(int personNumber) {
		this.personNumber = personNumber;
	}

	public Date getTimeGo() {
		return timeGo;
	}

	public void setTimeGo(Date timeGo) {
		this.timeGo = timeGo;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public int getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

	public bookCar() {
		super();
	}

	public bookCar(int bookCarId, String name, int personNumber, Date timeGo, String place, int phoneNumber, Car car) {
		super();
		this.bookCarId = bookCarId;
		this.name = name;
		this.personNumber = personNumber;
		this.timeGo = timeGo;
		this.place = place;
		this.phoneNumber = phoneNumber;
		this.car = car;
	}

	@Override
	public String toString() {
		return "bookCar [bookCarId=" + bookCarId + ", name=" + name + ", personNumber=" + personNumber + ", timeGo="
				+ timeGo + ", place=" + place + ", phoneNumber=" + phoneNumber + ", car=" + car + "]";
	}

}
