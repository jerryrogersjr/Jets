package com.skilldistillery.jets.app;

public class FighterJet extends Jet implements CombatReady {

	public FighterJet(String type, String model, double speed, int range, long price) {
		super(type, model, speed, range, price);

	}

	public FighterJet() {

	}

	@Override
	public void fly() {
		System.out.println("Max flight time of the " + this.getModel() + " with max speed of " + this.getSpeed()
				+ " mph " + " and max range of " + this.getRange() + " miles " + " would take " + this.flightTime()
				+ " hours.");
	}

	public double flightTime() {
		double time;
		time = this.getRange() / this.getSpeed();
		return time;
	}

	@Override
	public void fight() {

		System.out.println(this.getModel() + "\tBoom, ShakaLaka, Boom! \tAt " + this.getSpeed());
	}

}