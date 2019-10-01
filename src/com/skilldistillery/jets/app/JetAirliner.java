package com.skilldistillery.jets.app;

public class JetAirliner extends Jet {

	public JetAirliner(String type, String model, double speed, int range, long price) {
		super(type, model, speed, range, price);
	}
	
	public JetAirliner() {
		
	}

	@Override
	public void fly() {
				System.out.println("Max flight time of the " + this.getModel() + " with max speed of " + this.getSpeed() + " mph "
						+ " and max range of " + this.getRange() + " miles " + " would take " + this.flightTime() + " hours.");
	}

	public double flightTime() {
		double time;
		time = this.getRange() / this.getSpeed();
		return time;
	}
	
	
	

}