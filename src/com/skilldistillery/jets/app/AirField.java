package com.skilldistillery.jets.app;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AirField {
	Scanner kb = new Scanner(System.in);

	private List<Jet> jets;

	public AirField(List<Jet> jets) {
		super();
		this.jets = jets;
	}

	public AirField() {
		jets = new ArrayList<Jet>();
		jetReader();
	}

	public List<Jet> getJets() {
		for (Jet jet : jets) {
			System.out.println(jet);
		}
		return jets;
	}

	public void setJets(List<Jet> jets) {
		this.jets = jets;
	}

	public void addJet(Jet jet) {
		jets.add(jet);

	}

	public void fly() {
		System.out.println("Aircraft are Airborne");
			for (Jet jet : jets) {
				jet.fly();
			}
		
	}
	
	public void fight() {
		System.out.println("Here comes the BOOM!");
		for (Jet jet : jets) {
			if (jet instanceof FighterJet) {
				((FighterJet) jet).fight();
			}
		}
	}
	
	public void loadCargo() {
		System.out.println("Loading....");
		for (Jet jet : jets) {
			if (jet instanceof CargoPlane) {
				((CargoPlane) jet).loadCargo();
			}
		}
		
	}

	public void addToFleet() {
	}

	public void removeJetFromFleet() {
		// TODO Auto-generated method stub

	}

	public void jetReader() {
		try (BufferedReader bufIn = new BufferedReader(new FileReader("jets.txt"))) {
			String line;
			// for
			while ((line = bufIn.readLine()) != null) {
				String[] file = line.split(",");

				if (file[0].contentEquals("FighterJet")) {
					Jet fj = new FighterJet(file[0], file[1], Double.parseDouble(file[2]), Integer.parseInt(file[3]),
							Long.parseLong(file[4]));
					addJet(fj);
				} else if (file[0].contentEquals("CargoPlane")) {
					Jet cp = new CargoPlane(file[0], file[1], Double.parseDouble(file[2]), Integer.parseInt(file[3]),
							Long.parseLong(file[4]));
					addJet(cp);
				} else if (file[0].contentEquals("JetAirliner")) {
					Jet ja = new JetAirliner(file[0], file[1], Double.parseDouble(file[2]), Integer.parseInt(file[3]),
							Long.parseLong(file[4]));
					addJet(ja);
				}

			}
			bufIn.close();
		} catch (IOException e) {
			System.err.println(e);
		}

	}



}