package com.skilldistillery.jets.app;

public abstract class Jet {
	private String type;
	private String model;
	private double speed;
	private int range;
	private long price;

	public Jet() {
		// TODO Auto-generated constructor stub
	}

	public Jet(String type, String model, double speed, int range, long price) {
		super();
		this.type = type;
		this.model = model;
		this.speed = speed;
		this.range = range;
		this.price = price;
	}

	public void fly() {

	}

	public abstract double flightTime();

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public int getRange() {
		return range;
	}

	public void setRange(int range) {
		this.range = range;
	}

	public long getPrice() {
		return price;
	}

	public void setPrice(long price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Jet type: " + type + ", Model: " + model + ", Speed (Mph): " + speed + ", Range: " + range + ", Price: "
				+ price;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}