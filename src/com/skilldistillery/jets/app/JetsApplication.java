package com.skilldistillery.jets.app;

import java.util.Scanner;

public class JetsApplication {
	// private List<Jet> jet = new ArrayList<>();

	private AirField airfield;

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		JetsApplication app = new JetsApplication();
		app.airfield = new AirField();
		app.launch(kb);

	}

	public void launch(Scanner kb) {

		while (true) {
			displayUserMenu();
			menuSelect(kb);
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
			airfield.topSpeed();
			System.out.println();

		}

		if (selection == 4) {
			airfield.longestRange();
			System.out.println();

		}

		if (selection == 5) {
			airfield.loadCargo();
			System.out.println();

		}

		if (selection == 6) {
			airfield.fight();
			System.out.println();
		}

		if (selection == 7) {
			airfield.addToFleetMenu();
			airfield.addToFleet();
			System.out.println();
		}

		if (selection == 8) {
			airfield.removeJetFromFleet();
			System.out.println();
		}

		if (selection == 9) {
			System.out.println("\nHave a good one Airborne!");
			System.exit(0);
		}
	}

}