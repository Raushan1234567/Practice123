package com.masai;

public class Country {
	String countryName;
	String continentName;
	double area;
	public Country(String countryName, String continentName, double area) {
		super();
		this.countryName = countryName;
		this.continentName = continentName;
		this.area = area;
	}
	
	@Override
	public String toString() {
		return "Country [countryName=" + countryName + ", continentName=" + continentName + ", area=" + area + "]";
	}

	public String getCountryName() {
		return countryName;
	}
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	public String getContinentName() {
		return continentName;
	}
	public void setContinentName(String continentName) {
		this.continentName = continentName;
	}
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}
	
}