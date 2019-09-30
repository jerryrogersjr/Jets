package com.skilldistillery.jets.app;

public class FighterJet extends Jet implements CombatReady {

	public FighterJet(String type, String model, double speed, int range, long price) {
		super(type, model, speed, range, price);
		
	}

	public FighterJet() {

	}

	public void flight() {
		System.out.println("need flight method completed");
	}

	@Override
	public void fly() {
		//System.out.println("test call to menu"); // delete when done
				//System.out.println(super.toString());
				System.out.println("Max flight time of the " + this.getModel() + " with max speed of " + this.getSpeed() + " mph "
						+ " and max range of " + this.getRange() + " miles " + " would take " + this.flightTime() + " hours.");
	}

	public double flightTime() {
		double time;
		time = this.getRange() / this.getSpeed();
		return time;
	}

	@Override
	public void fight() {
		// TODO Auto-generated method stub
		System.out.println("Boom, ShakaLaka, Boom! \tAt " + this.getSpeed());
	}

}