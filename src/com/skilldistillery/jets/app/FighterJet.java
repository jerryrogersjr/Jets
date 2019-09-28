package com.skilldistillery.jets.app;

public class FighterJet extends Jet implements CombatReady {

	public FighterJet(String model, double speed, int range, long price) {
		super(model, speed, range, price);
		
	}

	public FighterJet() {

	}

	public void flight() {
		System.out.println("need flight method completed");
	}

	@Override
	public void fly() {
		System.out.println(super.toString());
		System.out.println("Max flight time of the " + getModel() + "with max speed of " + getSpeed() + " mph "
				+ " and max range of " + getRange() + " miles " + " would take " + flightTime() + " hours.");
	}

	public double flightTime() {
		double time;
		time = getRange() / getSpeed();
		return time;
	}

	@Override
	public void fight() {
		// TODO Auto-generated method stub
		System.out.println("Boom, ShakaLaka, Boom!");
	}

}