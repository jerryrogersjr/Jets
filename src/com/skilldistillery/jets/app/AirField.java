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
		System.out.println("What type of Jet would you like to add?");
		System.out.println("press 1 for FighterJet");
		System.out.println("press 2 for CargoPlane");
		System.out.println("press 3 for JetAirliner");
		System.out.println("press 4 to Exit this Menu");
		String input = kb.next();
//		if (input.contentEquals("1")) {
//			Jet fj = new FighterJet(model, type, speed, range, price);
//			Jet type = new FighterJet();
//			System.out.println("Enter Model Name: ");
//			String model = kb.next();
//			System.out.println("Enter Speed: ");
//			double speed = kb.nextDouble();
//			System.out.println("Enter Range: ");
//			double range = kb.nextDouble();
//			System.out.println("Enter Price: ");
//			long price = kb.nextLong();
//			addJet(type);
//		}
		
		
	}

	public void removeJetFromFleet() {

	}

	public void longestRange() {
		double longRange = 0.0;
		System.out.println("This Jet has the Longest Range in the fleet:");
		for (Jet jet : jets) {
			if (jet.getRange() > longRange) {
				longRange = jet.getRange();
			}
		}

		for (Jet jet : jets) {
			if (longRange == jet.getRange()) {
				System.out.println(jet.toString());
			}
		}
	}

	public void topSpeed() {
		double topSpeed = 0.0;
		System.out.println("This is the fastest Jet in the fleet:");
		for (Jet jet : jets) {
			if (jet.getSpeed() > topSpeed) {
				topSpeed = jet.getSpeed();
			}
		}

		for (Jet jet : jets) {
			if (topSpeed == jet.getSpeed()) {
				System.out.println(jet.toString());
			}
		}
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