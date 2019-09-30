package com.skilldistillery.jets.app;

import java.util.ArrayList;
import java.util.List;

public class AirField {

	private List<Jet> jets;

	public AirField(List<Jet> jets) {
		super();
		this.jets = jets;
	}

	public AirField() {
		jets = new ArrayList<Jet>();
		
	}

	public List<Jet> getJets() {
		
		return jets;
	}

	public void setJets(List<Jet> jets) {
		this.jets = jets;
	}
	
	public void addJet(Jet jet) {
		jets.add(jet);
		
	}

	public void fly() {
		System.out.println("Aircraft is airborne");
		System.out.println();
	}

}