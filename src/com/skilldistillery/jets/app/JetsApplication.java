package com.skilldistillery.jets.app;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
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

		//while (true) {
			displayUserMenu();
			menuSelect(kb);
		//}
	}

	public void jetReader() {
		// List<Jet> jets = new ArrayList<>();
		
		try (BufferedReader bufIn = new BufferedReader(new FileReader("jets.txt"))) {
			String line;
			while ((line = bufIn.readLine()) != null) {
				String[] jetFile = line.split(", ");
				String type = jetFile[0];
				String model = jetFile[1];
				int speed = Integer.parseInt(jetFile[2]);
				int range = Integer.parseInt(jetFile[3]);
				long price = Long.parseLong(jetFile[4]);
				//switch (elements[0].charAt(0)) {
				switch (type) {
				case "FighterJet" :
					Jet fj = new FighterJet(model, speed, range, price);
					jet.add(fj);
					break;
				case "CargoPlane" :
					Jet cp = new CargoPlane(model, speed, range, price);
					jet.add(cp);
					break;
				case "JetAirline" :
					Jet ja = new JetAirliner(model, speed, range, price);
					jet.add(ja);
					break;
				default:
					break;
				}
			}
		} catch (IOException e) {
			System.err.println(e);
		}
	}

	public void addJet(Scanner kb) {
		System.out.println("What type of Jet: FighterJet, CargoPlane, or JetAirliner?");
		
		String input = kb.next();
		while(true) {
		if (input.equalsIgnoreCase("FighterJet")) {
			System.out.println("Model: ");
			String model = kb.next();
			System.out.println("Speed: ");
			double speed = Double.parseDouble(kb.next());
			System.out.println("Range: ");
			int range = Integer.parseInt(kb.next());
			System.out.println("Price: ");
			long price = Long.parseLong(kb.next());
//			airfield.addJet();
			launch(kb);
		} else if (input.equalsIgnoreCase("CargoPlane")) {
			System.out.println("Model: ");
			String model = kb.next();
			System.out.println("Speed: ");
			double speed = Double.parseDouble(kb.next());
			System.out.println("Range: ");
			int range = Integer.parseInt(kb.next());
			System.out.println("Price: ");
			long price = Long.parseLong(kb.next());
//			airfield.addJet();
//			airfield.addJet(new CargoPlane(model, speed, range, price));
			launch(kb);
		} else if (input.equalsIgnoreCase("JetAirliner")) {
			System.out.println("Model: ");
			String model = kb.next();
			System.out.println("Speed: ");
			double speed = Double.parseDouble(kb.next());
			System.out.println("Range: ");
			int range = Integer.parseInt(kb.next());
			System.out.println("Price: ");
			long price = Long.parseLong(kb.next());
//			airfield.addJet();
//			airfield.addJet(new JetAirliner(model, speed, range, price));
			launch(kb);
		}
		else {
			System.out.println("\nPlease try agian\n");
			launch(kb);
		}
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
			addJet(kb);
			
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