package com.skilldistillery.jets.app;

public class CargoPlane extends Jet implements CargoCarrier {

	public CargoPlane(String model, double speed, int range, long price) {
		super(model, speed, range, price);
	}

	public CargoPlane() {

	}
	
	public void flight() {
		System.out.println("need flight method completed");
	}

	@Override
	public void fly() {
		System.out.println("test call to menu"); // delete when done
		System.out.println(super.toString());
		System.out.println("Max flight time of the " + getModel() + " with max speed of " + getSpeed() + " mph "
				+ " and max range of " + getRange() + " miles " + " would take " + flightTime() + " hours.");
	}

	@Override
	public double flightTime() {
		double time;
		time = getRange() / getSpeed();
		return time;
	}

	@Override
	public void loadCargo() {
		System.out.println("All loaded up Hoss. Get ready to get airborne.");
	}

}