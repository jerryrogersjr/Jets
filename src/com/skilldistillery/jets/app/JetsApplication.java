package com.skilldistillery.jets.app;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JetsApplication {
	private List<Jet> jet = new ArrayList<>();

	private AirField airfield = new AirField();

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		JetsApplication app = new JetsApplication();
//		app.jetReader();
//		app.addJet(kb);
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

	public List<Jet> jetReader() {
		// List<Jet> jets = new ArrayList<>();

		try (BufferedReader bufIn = new BufferedReader(new FileReader("jets.txt"))) {
			String line;
			while ((line = bufIn.readLine()) != null) {
				String[] jetFile = line.split(", ");

				if (jetFile[0].contentEquals("FighterJet")) {
					jet.add(new FighterJet(jetFile[0], jetFile[1], Double.parseDouble(jetFile[2]),
							Integer.parseInt(jetFile[3]), Long.parseLong(jetFile[4])));
				} else if (jetFile[0].contentEquals("CargoPlane")) {
					jet.add(new CargoPlane(jetFile[0], jetFile[1], Double.parseDouble(jetFile[2]),
							Integer.parseInt(jetFile[3]), Long.parseLong(jetFile[4])));
				} else if (jetFile[0].contentEquals("JetAirliner")) {
					jet.add(new JetAirliner(jetFile[0], jetFile[1], Double.parseDouble(jetFile[2]),
							Integer.parseInt(jetFile[3]), Long.parseLong(jetFile[4])));
				}


				// System.out.println(line);

			}
			bufIn.close();
		} catch (IOException e) {
			System.err.println(e);
		}
		return jet;

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
			System.out.println(jet);
		}
		if (selection == 2) {

		}
		if (selection == 3) {

		}
		if (selection == 4) {
			// break;
		}
		if (selection == 5) {

		}
		if (selection == 6) {

		}
		if (selection == 7) {
//			addJet(kb);

		}
		if (selection == 8) {
			// break;
		}
		if (selection == 9) {
			System.out.println("\nHave a good one Airborne!");
			System.exit(0);
		}
	}

}