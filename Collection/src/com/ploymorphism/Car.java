package com.ploymorphism;

public class Car {
	
	private int model_no;
	private String name;
	private String colour;
	private int price;
	public int getModel_no() {
		return model_no;
	}
	public void setModel_no(int model_no) {
		this.model_no = model_no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Car [model_no=" + model_no + ", name=" + name + ", colour=" + colour + ", price=" + price + "]";
	}
	
	
	
	

}
