package com.skilldistillery.jets.app;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class JetsApplication {

	private AirField airfield = new AirField();

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		JetsApplication app = new JetsApplication();
		// app.jetReader();

		app.launch(kb);

	}

	public void launch(Scanner kb) {
		jetReader();

		while (true) {
			displayUserMenu();
			menuSelect(kb);
		}
	}

	public void jetReader() {
		String line;
		try (BufferedReader bufIn = new BufferedReader(new FileReader("jets.txt"))) {
			while ((line = bufIn.readLine()) != null) {
				String[] elements = line.split(", ");
				switch (elements[0].charAt(0)) {

				case 'F':
					airfield.addJet(new FighterJet(elements[0], Double.parseDouble(elements[1]),
							Integer.parseInt(elements[2]), Long.parseLong(elements[3])));
					break;
				case 'C':
					airfield.addJet(new CargoPlane(elements[0], Double.parseDouble(elements[1]),
							Integer.parseInt(elements[2]), Long.parseLong(elements[3])));
					break;
				case 'J':
					airfield.addJet(new JetAirliner(elements[0], Double.parseDouble(elements[1]),
							Integer.parseInt(elements[2]), Long.parseLong(elements[3])));
					break;
				}
			}
		} catch (IOException e) {
			System.err.println(e);
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