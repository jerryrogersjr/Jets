package com.skilldistillery.jets.app;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class JetsApplication {
	//private List<Jet> jet = new ArrayList<>();

	private AirField airfield;

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		JetsApplication app = new JetsApplication();
		app.airfield = new AirField();
		app.launch(kb);
//		app.airfield.getJets();
	}

	public void launch(Scanner kb) {
		jetReader();

		while (true) {
			displayUserMenu();
			menuSelect(kb);
		}
	}

	public void jetReader() {
//		 List<Jet> jets = new ArrayList<>();
		// /Users/jerryrogers/SD/Java/workspace/Jets/jets.txt
		try (BufferedReader bufIn = new BufferedReader(new FileReader("jets.txt"))) {
			String line;
			while ((line = bufIn.readLine()) != null) {
				// System.out.println(line); Prints from the text file.
				String[] jetFile = line.split(", ");
				jetFile[0].charAt(0);
				
				if (jetFile[0].equalsIgnoreCase("FighterJet")) {
					airfield.addJet(new FighterJet(jetFile[0], jetFile[1], Double.parseDouble(jetFile[2]),
							Integer.parseInt(jetFile[3]), Long.parseLong(jetFile[4])));
				} else if (jetFile[0].equalsIgnoreCase("CargoPlane")) {
					airfield.addJet(new CargoPlane(jetFile[0], jetFile[1], Double.parseDouble(jetFile[2]),
							Integer.parseInt(jetFile[3]), Long.parseLong(jetFile[4])));
				} else if (jetFile[0].equalsIgnoreCase("JetAirliner")) {
					airfield.addJet(new JetAirliner(jetFile[0], jetFile[1], Double.parseDouble(jetFile[2]),
							Integer.parseInt(jetFile[3]), Long.parseLong(jetFile[4])));
				}

			}
			bufIn.close();
		} catch (IOException e) {
			System.err.println(e);
		}
		// return jet;

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

	public void menuSelect(Scanner kb) {
		int selection = kb.nextInt();
		if (selection == 1) {
			airfield.getJets();
			System.out.println();
		}
		if (selection == 2) {
			airfield.fly();
			System.out.println();

		}
		if (selection == 3) {
			getTopSpeed();
			System.out.println();
		}
		if (selection == 4) {
			// break;
		}
		if (selection == 5) {

		}
		if (selection == 6) {
			for (Jet jet : airfield.getJets()) {
				if (jet instanceof FighterJet) {
					((FighterJet) jet).fight();
				}
			}
		}
		if (selection == 7) {
//			addJet(kb);

		}
		if (selection == 8) {
			
		}
		if (selection == 9) {
			System.out.println("\nHave a good one Airborne!");
			System.exit(0);
		}
	}

	private void getTopSpeed() {
		double fastestSpeed = 0.0;
		System.out.println("Fastest Jet: ");
		for (Jet jet : airfield.getJets()) {
			if (jet.getSpeed() > fastestSpeed) {
				fastestSpeed = jet.getSpeed();
			}
		}
		for (Jet jet : airfield.getJets()) {
			if (jet.getSpeed() == fastestSpeed) {
				System.out.println(jet);
			}
			break;
		}
	}

}