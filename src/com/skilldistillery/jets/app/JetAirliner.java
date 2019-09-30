package com.skilldistillery.jets.app;

public class JetAirliner extends Jet {

	public JetAirliner(String type, String model, double speed, int range, long price) {
		super(type, model, speed, range, price);
	}
	
	public JetAirliner() {
		
	}

	@Override
	public void fly() {
		System.out.println(super.toString());
		System.out.println("Max flight time of the " + getModel() + "with max speed of " + getSpeed() + " mph "
		+ " and max range of " + getRange() + " miles " + " would take " + flightTime() + " hours.");
	}

	@Override
	public double flightTime() {
		double time;
		time = getRange() / getSpeed();
		return time;
	}
	
	
	

}