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

	private static int newCount = 0;

	public static void main(String []args) throws Exception {
		// first get input from file symptoms.txt
		BufferedReader reader = new BufferedReader (new FileReader("symptoms.txt"));
		String line = reader.readLine();
		Map<String, Integer> mapSortie = new HashMap<String, Integer>();

		//loop to analyse the list provided by Symptoms.txt
		while (line != null) {
			if (mapSortie.containsKey(line)) {            //recherche si l'élément lu est présent dans la map
				mapSortie.computeIfPresent(line,(key,val) -> val + 1);		//incementation de 1 si l'élémént est présent
				System.out.println(mapSortie);		//verification : ce qui se passe à chaque boucle
			}
			else {										//creation de l'élément dans la map et incrementation de 1
				mapSortie.put(line, 1);
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
