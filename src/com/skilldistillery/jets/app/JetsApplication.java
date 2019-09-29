package com.skilldistillery.jets.app;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JetsApplication {

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

		app.launch(app, kb);

	}

	public void launch(JetsApplication app, Scanner kb) {

		while (true) {
			app.displayUserMenu();
			app.menuSelect(kb, app);
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

	public void menuSelect(Scanner kb, JetsApplication app) {
		FighterJet fj = new FighterJet();
		CargoPlane cp = new CargoPlane();
		int selection = kb.nextInt();
		if (selection == 1) {
			System.out.println("test");
			// af.displayUserMenu();
		}
		if (selection == 2) {
//				fj.fly();
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

//	public List<Jet> jetReader(String file) {
//		String line;
//		file = "Jets.txt";
//		List<Jet> jets = new ArrayList<>();
//
//		try (BufferedReader bufIn = new BufferedReader(new FileReader(file))) {
//			
//			
//			while ((line = bufIn.readLine()) != null) {
//				String[] jetFile = line.split(", ");
//				String type = jetFile[0];
//				String model = jetFile[1];
//				double speed = Double.parseDouble(jetFile[2]);
//				int range = Integer.parseInt(jetFile[3]);
//				long price = Long.parseLong(jetFile[4]);
//				
//				if (type.equalsIgnoreCase("fighter")) {
//					Jet j = new FighterJet();
//					jets.add(j);
//					
//				}
//				
//			}
//		} catch (IOException e) {
//			System.err.println(e);
//		}
//		return jets;
//	}

}