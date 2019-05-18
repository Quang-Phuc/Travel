package edu.fa.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Car {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int carId;
	private String carTitle;
	@Column(length = 4000)
	private String carImage;
	@Column(length = 4000)
	private String carShortContents;
	@Column(length = 4000)
	private String carContents;
	private int carNumberPhone;
	@Column(length = 4000)
	private String carInforDriver;
	private String carNameDriver;
	public int getCarId() {
		return carId;
	}
	public void setCarId(int carId) {
		this.carId = carId;
	}
	public String getCarTitle() {
		return carTitle;
	}
	public void setCarTitle(String carTitle) {
		this.carTitle = carTitle;
	}
	public String getCarImage() {
		return carImage;
	}
	public void setCarImage(String carImage) {
		this.carImage = carImage;
	}
	public String getCarShortContents() {
		return carShortContents;
	}
	public void setCarShortContents(String carShortContents) {
		this.carShortContents = carShortContents;
	}
	public String getCarContents() {
		return carContents;
	}
	public void setCarContents(String carContents) {
		this.carContents = carContents;
	}
	public int getCarNumberPhone() {
		return carNumberPhone;
	}
	public void setCarNumberPhone(int carNumberPhone) {
		this.carNumberPhone = carNumberPhone;
	}
	public String getCarInforDriver() {
		return carInforDriver;
	}
	public void setCarInforDriver(String carInforDriver) {
		this.carInforDriver = carInforDriver;
	}
	public String getCarNameDriver() {
		return carNameDriver;
	}
	public void setCarNameDriver(String carNameDriver) {
		this.carNameDriver = carNameDriver;
	}
	public Car() {
		super();
	}
	public Car(int carId, String carTitle, String carImage,
			String carShortContents, String carContents, int carNumberPhone,
			String carInforDriver, String carNameDriver) {
		super();
		this.carId = carId;
		this.carTitle = carTitle;
		this.carImage = carImage;
		this.carShortContents = carShortContents;
		this.carContents = carContents;
		this.carNumberPhone = carNumberPhone;
		this.carInforDriver = carInforDriver;
		this.carNameDriver = carNameDriver;
	}
	
	
	
	
	
	
	

}
