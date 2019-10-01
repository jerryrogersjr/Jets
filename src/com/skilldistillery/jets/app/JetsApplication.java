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
//		airfield.jetReader();
//		jetReader();

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
			getTopSpeed();
			System.out.println();

		}

		if (selection == 4) {
			getLongestRange();
			
		}

		if (selection == 5) {
			airfield.loadCargo();
		
		
		}

		if (selection == 6) {
		
		}

		if (selection == 7) {
			airfield.addToFleet();
		}

		if (selection == 8) {
			airfield.removeJetFromFleet();
		}

		if (selection == 9) {
			System.out.println("\nHave a good one Airborne!");
			System.exit(0);
		}
	}

	private void getLongestRange() {
		// TODO Auto-generated method stub

	}

	private void getTopSpeed() {
		double fastestSpeed = 0.0;
		System.out.println("Fastest Jet: ");
	}

}