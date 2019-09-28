package com.skilldistillery.jets.app;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class AirField {

	private List<Jet> jets = new ArrayList<>();



	public void listFleet() {

	}

	public void setJets(List<Jet> jets) {
		this.jets = jets;
	}

//	public List<Jet> parseJets(String fileName) {
//		try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
//			String line;
//
//			while ((line = br.readLine()) != null) {
//				String[] jetLine = line.split(", ");
//
//				String line1 = jetLine[0];
//				String model = jetLine[1];
//				Double speed = Double.parseDouble(jetLine[2]);
//				Integer range = Integer.parseInt(jetLine[3]);
//				Long price = Long.parseLong(jetLine[4]);
//
//				Jet jet = null;
//
//				switch (line1) {
//				case "fighter":
//					jet = new FighterJet(model, speed, range, price);
//					break;
//				case "airliner":
//					jet = new JetAirliner(model, speed, range, price);
//					break;
//				case "cargo":
//					jet = new CargoPlane(model, speed, range, price);
//					break;
//				default:
//					break;
//				}
//
//				jets.add(jet);
//			}
//
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//
//		return jets;
//	}

	public void getJets() {
		// TODO Auto-generated method stub
		
	}

}