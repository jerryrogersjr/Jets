package com.skilldistillery.jets.app;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class AirField {

	private List<Jet> jets = new ArrayList<>();

	public AirField(List<Jet> jets) {
		super();
		this.jets = jets;
	}

	public AirField(String model, double speed, int range, long price) {
		// TODO Auto-generated constructor stub
	}

	public List<Jet> getJets() {
		return jets;
	}

	public void setJets(List<Jet> jets) {
		this.jets = jets;
	}



}