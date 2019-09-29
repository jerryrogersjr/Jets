package com.skilldistillery.jets.app;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class JetsApplication {

	private AirField airfield = new AirField();

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		JetsApplication app = new JetsApplication();
//		app.jetReader();
		app.addJet(kb);
//		app.launch(kb);

	}

	public void launch(Scanner kb) {
		jetReader();

		while (true) {
			displayUserMenu();
			menuSelect(kb);
		}
	}

	public void jetReader() {
		// List<Jet> jets = new ArrayList<>();
		String line;
		try (BufferedReader bufIn = new BufferedReader(new FileReader("jets.txt"))) {
			// System.out.println(Arrays.asList(jets));
			// }
			while ((line = bufIn.readLine()) != null) {
				String[] elements = new String[5];
				elements = line.split(", ");
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
				System.out.println(airfield);
				System.out.println(elements);
			}
			bufIn.close();
			System.out.println(Arrays.asList(line));
		} catch (IOException e) {
			System.err.println(e);
		}
	}

	public void addJet(Scanner kb) {
		System.out.println("What type of Jet: FighterJet, CargoPlane, or JetAirliner?");
		String input = kb.nextLine();
		if (input.equalsIgnoreCase("FighterJet")) {
			System.out.println("Model: ");
			String model = kb.nextLine();
			System.out.println("Speed: ");
			double speed = Double.parseDouble(kb.next());
			System.out.println("Range: ");
			int range = Integer.parseInt(kb.next());
			System.out.println("Price: ");
			long price = Long.parseLong(kb.next());
			airfield.addJet(new FighterJet(model, speed, range, price));
		}
		else if (input.equalsIgnoreCase("CargoPlane")) {
			System.out.println("Model: ");
			String model = kb.nextLine();
			System.out.println("Speed: ");
			double speed = Double.parseDouble(kb.next());
			System.out.println("Range: ");
			int range = Integer.parseInt(kb.next());
			System.out.println("Price: ");
			long price = Long.parseLong(kb.next());
			airfield.addJet(new CargoPlane(model, speed, range, price));
		}
		else if (input.equalsIgnoreCase("JetAirliner")) {
			System.out.println("Model: ");
			String model = kb.nextLine();
			System.out.println("Speed: ");
			double speed = Double.parseDouble(kb.next());
			System.out.println("Range: ");
			int range = Integer.parseInt(kb.next());
			System.out.println("Price: ");
			long price = Long.parseLong(kb.next());
			airfield.addJet(new JetAirliner(model, speed, range, price));
		}
		else {
			kb.hasNext();
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