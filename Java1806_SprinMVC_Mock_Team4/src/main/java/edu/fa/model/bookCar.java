package edu.fa.model;

import java.util.Date;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

public class bookCar {
	private String name;
	private int personNumber;
	@Temporal(TemporalType.DATE)
	private Date timeGo;
	private String place;
	private int phoneNumber;
	@ManyToOne /* (fetch = FetchType.LAZY) */
	@JoinColumn(name = "car")
	private Car car;

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

	public bookCar(String name, int personNumber, Date timeGo, String place, int phoneNumber, Car car) {
		super();
		this.name = name;
		this.personNumber = personNumber;
		this.timeGo = timeGo;
		this.place = place;
		this.phoneNumber = phoneNumber;
		this.car = car;
	}

	@Override
	public String toString() {
		return "bookCar [name=" + name + ", personNumber=" + personNumber + ", timeGo=" + timeGo + ", place=" + place
				+ ", phoneNumber=" + phoneNumber + ", car=" + car + "]";
	}

}
