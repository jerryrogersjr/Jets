package com.skilldistillery.jets.app;

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
		JetsApplication af = new JetsApplication();
		
		af.launch(af, kb);

	}

	public void launch(JetsApplication af, Scanner kb) {
		af.displayUserMenu();

		af.menuSelect(kb, af);

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

	public void menuSelect(Scanner kb, JetsApplication af) {
		FighterJet fj = new FighterJet();
		CargoPlane cp = new CargoPlane();
		
		
		while (true) {
			af.displayUserMenu();
			int selection = kb.nextInt();

			if (selection == 1) {
				System.out.println("test");
				//af.displayUserMenu();
			}

			if (selection == 2) {
				fj.fly();
			}
			if (selection == 3) {
				//break;
			}
			if (selection == 4) {
				//break;
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
				//break;
			}
			if (selection == 9) {
				System.out.println("\nHave a good one Airborne!");
				System.exit(0);
			}
		}

	}

	public AirField getAirField() {
		return airField;
	}

	public void setAirField(AirField airField) {
		this.airField = airField;
	}
	

}