package com.skilldistillery.jets.app;

public class CargoPlane extends Jet implements CargoCarrier {

	public CargoPlane(String type, String model, double speed, int range, long price) {
		super(type, model, speed, range, price);
	}

	public CargoPlane() {

	}

	public void flight() {
		System.out.println("need flight method completed");
	}

	@Override
	public void fly() {
		System.out.println("Max flight time of the " + this.getModel() + " with max speed of " + this.getSpeed()
				+ " mph " + " and max range of " + this.getRange() + " miles " + " would take " + this.flightTime()
				+ " hours.");
	}

	@Override
	public double flightTime() {
		double time;
		time = getRange() / getSpeed();
		return time;
	}

	@Override
	public void loadCargo() {
		System.out.println(this.getModel() + " 64 Jumpers on a one way trip. Get ready to be airborne!\n");
	}

}