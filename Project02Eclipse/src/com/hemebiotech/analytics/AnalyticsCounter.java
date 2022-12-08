package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.HashMap;
import java.util.Map;

public class AnalyticsCounter {
	private static int headCount = 0;
	private static int rashCount = 0;
	private static int pupilCount = 0;

	public static void main(String []args) throws Exception {
		// first get input from file symptoms.txt
		BufferedReader reader = new BufferedReader (new FileReader("symptoms.txt"));
		String line = reader.readLine();
		Map<String, Integer> mapSortie = new HashMap<String, Integer>();

		//loop to analyse the list provided by Symptoms.txt
		while (line != null) {
			if (line.equals("headache")) {
				headCount++;
				mapSortie.put("headache", headCount);
				System.out.println(mapSortie);
				// mapSortie.get(headache )
			}
			else if (line.equals("rash")) {
				rashCount++;
				mapSortie.put("rash", rashCount);
				System.out.println(mapSortie);

			}
			else if (line.contains("pupils")) {			//Counts all elements related to pupils (constricted or dilated)
				pupilCount++;
				mapSortie.put("pupils", pupilCount);
				System.out.println(mapSortie);

			}
			line = reader.readLine();
		}

		FileWriter writer = new FileWriter ("result.out");
		writer.write("- Headache: " + headCount + "\n");
		writer.write("- Rash: " + rashCount + "\n");
		writer.write("- Dialated pupils: " + pupilCount + "\n");
		writer.close();
	}
}


	// test modif refactoring v2

