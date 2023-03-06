package com.carDriver;

import java.util.Arrays;

public class Car {

	private int carNo;
	private String brand;
	private String model;
	private Driver driver[];
	
	Car(){
		
	}
	Car(int carNo, String brand, String model, Driver driver[]){
		this.carNo = carNo;
		this.brand = brand;
		this.model = model;
		this.driver = driver;
	}
	
	public int getCarNo() {
		return carNo;
	}
	public void setCarNo(int carNo) {
		this.carNo = carNo;
	}
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	
	public Driver[] getDriver() {
		return driver;
	}
	public void setDriver(Driver driver[]) {
		this.driver = driver;
	}
	
	public String toString() {
		return ("Car : ["+carNo+" "+brand+" "+model+" "+Arrays.toString(driver)+" ]");
	}
}
