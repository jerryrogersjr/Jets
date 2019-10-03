package com.skilldistillery.jets.app;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import javax.sound.midi.SysexMessage;

public class AirField {
	Scanner kb = new Scanner(System.in);

	private List<Jet> jets;

	public AirField(List<Jet> jets) {
		super();
		this.jets = jets;
	}

	public AirField() {
		jets = new ArrayList<Jet>();
		jetReader(null);
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
		System.out.println("All Aircraft are Airborne");
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

	public void addToFleetMenu() {
		System.out.println("What type of Jet would you like to add?");
		System.out.println("press 1 for FighterJet");
		System.out.println("press 2 for CargoPlane");
		System.out.println("press 3 for JetAirliner");
		System.out.println("enter 'quit' to Exit this Menu");
	}

	public void addToFleet() {

		String model = null;
		double speed = 0;
		int range = 0;
		long price = 0;
		String input = kb.next();

		if (input.equalsIgnoreCase("quit")) {
			kb.nextLine();

		}

		if (input.contentEquals("1")) {
			String FighterJet = "FighterJet";
			String type = FighterJet;
			System.out.println("Enter Model Name: ");
			model = kb.next();
			System.out.println("Enter Speed: ");
			speed = kb.nextDouble();
			System.out.println("Enter Range: ");
			range = kb.nextInt();
			System.out.println("Enter Price: ");
			price = kb.nextLong();
			Jet fj = new FighterJet(type, model, speed, range, price);
			addJet(fj);
		}
		if (input.contentEquals("2")) {
			String CargoPlane = "CargoPlane";
			String type = CargoPlane;
			System.out.println("Enter Model Name: ");
			model = kb.next();
			System.out.println("Enter Speed: ");
			speed = kb.nextDouble();
			System.out.println("Enter Range: ");
			range = kb.nextInt();
			System.out.println("Enter Price: ");
			price = kb.nextLong();
			Jet cp = new CargoPlane(type, model, speed, range, price);
			addJet(cp);
		}
		if (input.contentEquals("3")) {
			String JetAirliner = "JetAirliner";
			String type = JetAirliner;
			System.out.println("Enter Model Name: ");
			model = kb.next();
			System.out.println("Enter Speed: ");
			speed = kb.nextDouble();
			System.out.println("Enter Range: ");
			range = kb.nextInt();
			System.out.println("Enter Price: ");
			price = kb.nextLong();
			Jet ja = new JetAirliner(type, model, speed, range, price);
			addJet(ja);
		}

	}

	public void removeJetFromFleet() {
		getJets();
		System.out.println("----------------------------------------------");
		System.out.println("Which Jet would you like to remove?");
		System.out.println("Enter the MODEL that you would like to remove.");
		String input = kb.next();
		// getJets().remove()
	}

	public void removeJet(Scanner kb) {
		System.out.println("SELECT the JET NUMBER to REMOVE\n");
		int i = -1;
		for (Jet jet : jets) {
			i++;
			System.out.println("Jet Number: " + i + "\t" + jet.toString());
			System.out.println();
			
		}
		try {
			int index = kb.nextInt();
			System.out.println("Jet " + index + " Removed");
			jets.remove(index);
		} catch (InputMismatchException e) {
			e.getMessage();
			System.err.println("Try Again");
		} catch (Exception e) {
			System.err.println("Try Again");
		}

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

	public void jetReader(String[] file) {
		try (BufferedReader bufIn = new BufferedReader(new FileReader("jets.txt"))) {
			String line;
			// for
			while ((line = bufIn.readLine()) != null) {
				file = line.split(",");

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

		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}