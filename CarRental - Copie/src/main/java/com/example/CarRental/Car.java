package com.example.CarRental;





public class Car {
	
	private String plateNumber;
	private int price;
	private int numberOfSeats = 2;
	private String brand;
	private String dateDebut = null;
	private String dateFin = null;
	private boolean rent = false;
	
	public Car() {
		super();
	}
	
	public Car(String plateNumber, String brand, int price, int numberOfSeats) {
		super();
		this.plateNumber = plateNumber;
		this.brand = brand;
		this.price = price;
		this.numberOfSeats = numberOfSeats;
		
	}

	public String getPlateNumber() {
		return plateNumber;
	}
	
	public void setPlateNumber(String plateNumber) {
		this.plateNumber = plateNumber;
	}
	
	public int getNumberOfSeats() {
		return numberOfSeats;
	}

	public void setNumberOfSeats(int numberOfSeats) {
		this.numberOfSeats = numberOfSeats;
	}

	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}
	

	@Override
	public String toString() {
		return "Car [plateNumber=" + plateNumber + ", brand= " + brand + ", price=" + price  + ", numberOfSeats=" + numberOfSeats + "]" ; 
	}
	
	
	public String getDateDebut() {
		return dateDebut;
	}

	public void setDateDebut(String string) {
		this.dateDebut = string;
	}

	public String getDateFin() {
		return dateFin;
	}

	public void setDateFin(String string) {
		this.dateFin = string;
	}

	public boolean isRent() {
		return rent;
	}

	public void setRent(boolean available) {
		this.rent = available;
	}

	

}
