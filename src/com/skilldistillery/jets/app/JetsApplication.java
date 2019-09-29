package com.skilldistillery.jets.app;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JetsApplication {

	private static List<Jet> jetList;
	private AirField airField;

	public JetsApplication() {
		// TODO Auto-generated constructor stub
	}

	public JetsApplication(AirField airField, Scanner kb) {
		super();
		this.setAirField(airField);

	}

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		JetsApplication app = new JetsApplication();

		//app.jetReader();

		app.launch(app, kb, jetList);

	}

	public void launch(JetsApplication app, Scanner kb, List<Jet> jetList) {
		while (true) {
			// app.jetReader();
			app.displayUserMenu();
			app.menuSelect(kb, app, jetList);

		}
	}

	public void jetReader() {
		List<Jet> jets = new ArrayList<>();
//		for(int i = 0; i < jets.size(); i++) {
//			jets.addAll(new ArrayList<Jet>());
//		}
		try {
			FileReader fr = new FileReader("jets.txt");
			BufferedReader bufIn = new BufferedReader(fr);

			String line;
			while ((line = bufIn.readLine()) != null) {
				
				String[] jetFile = line.split(", ");
				String type = jetFile[0];
				String model = jetFile[1];
				double speed = Double.parseDouble(jetFile[2]);
				int range = Integer.parseInt(jetFile[3]);
				long price = Long.parseLong(jetFile[4]);

				if (type.equalsIgnoreCase("Spirit")) {
					Jet fj = new FighterJet(model, speed, range, price);
					jets.add(fj);

				}
				if (type.equalsIgnoreCase("Hercules")) {
					Jet cp = new CargoPlane(model, speed, range, price);
					jets.add(cp);
				}
				if (type.equalsIgnoreCase("BoeingJumbo")) {
					Jet ja = new JetAirliner(model, speed, range, price);
					jets.add(ja);
				}
				bufIn.close();
			}
		} catch (IOException e) {
			System.err.println(e);
		}
		airField.setJets(jets);
		List<Jet> print = airField.getJets();
		for (Jet jet : print) {
			System.out.println(jet);
		}

	}

	public void displayUserMenu() {

		System.out.println("1: List Fleet");
		System.out.println("2: Fly All Jets");
		System.out.println("3: View Fastest Jet");
		System.out.println("4: View Jet w/ Longest Range");
		System.out.println("5: Load all Cargo Jets");
		System.out.println("6: Dogfight");
		System.out.println("7: Add a Jet to the Fleet");
		System.out.println("8: Remove a Jet from the Fleet");
		System.out.println("9: Quit");
	}

	public void menuSelect(Scanner kb, JetsApplication app, List<Jet> jetList) {
		FighterJet fj = new FighterJet();
		CargoPlane cp = new CargoPlane();
		JetAirliner ja = new JetAirliner();
		int selection = kb.nextInt();
		if (selection == 1) {
			app.getAirField();
		}
		if (selection == 2) {
			System.out.println("lost AF");
		}
		if (selection == 3) {
			// break;
		}
		if (selection == 4) {
			// break;
		}
		if (selection == 5) {
			cp.loadCargo();
		}
		if (selection == 6) {
			fj.fight();
		}
		if (selection == 7) {
			app.addJet(jetList, kb);
		}
		if (selection == 8) {
			// break;
		}
		if (selection == 9) {
			System.out.println("\nHave a good one Airborne!");
			System.exit(0);
		}
	}

	public AirField getAirField() {
		return airField;
	}

	public void setAirField(AirField airField) {
		this.airField = airField;
	}
	public void addJet(List<Jet> jetList, Scanner kb) {
		System.out.println("What type of Jet would you like to add? ");
		System.out.println("FighterJet, or ");
		System.out.println("CargoPlane, or ");
		System.out.println("JetAirliner");
		System.out.println("'Q' to Quit adding at anytime.");
		String type = kb.next();
		
		System.out.println("Enter the Model of Jet: ");
		String newModel = kb.next();
		
		System.out.println("Enter the Speed of Jet: ");
		double newSpeed = kb.nextDouble();
		
		System.out.println("Enter the Range of Jet: ");
		int newRange = kb.nextInt();
		
		System.out.println("Enter the Price of Jet: ");
		long newPrice = kb.nextLong();
		
		if (type.equalsIgnoreCase("FighterJet")) {
			Jet newType = new FighterJet(newModel, newSpeed, newRange, newPrice);
			airField.setJets(jetList);
			jetList.add(newType);
			
			
		} else if (type.equalsIgnoreCase("CargoPlane")) {
			Jet newType = new CargoPlane(newModel, newSpeed, newRange, newPrice);
		} else if (type.equalsIgnoreCase("JetAirliner")) {
			Jet newType = new JetAirliner(newModel, newSpeed, newRange, newPrice);
		} else if (kb.next().equalsIgnoreCase("Q")) {
			System.out.println();
			
			
		}
		airField.getJets();
		
	}
	
}