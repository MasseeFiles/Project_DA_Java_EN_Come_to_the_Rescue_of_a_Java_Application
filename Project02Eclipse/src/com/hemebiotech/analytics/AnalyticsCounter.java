package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AnalyticsCounter {
	public static void main(String[] args) throws Exception {

		ReadSymptomDataFromFile	file_Source = new ReadSymptomDataFromFile("symptoms.txt");				//création d'un objet file_Source - instanciation de la classe ReadSymptomDataFromFile
		file_Source.getSymptoms();																				//appel de la method getSymptoms sur l'objet file_Source - valeur retour est arraylist_result
		ArrayList<String> list = file_Source.getSymptoms();
				System.out.println(list);

		//AnalyticsCounter2 count_Source = new AnalyticsCounter2(list);
																												//appel de la method AnalyticsCounter2 sur l'objet count_Source - valeur retour est arraylist_result

		FileWriter writer = new FileWriter("result.out");

		// ReadSymptomDataFromFile.getSymptoms("symptoms.txt");
/*
		BufferedReader reader = new BufferedReader(new FileReader("symptoms.txt"));
		String line = reader.readLine();
		Map<String, Integer> mapSortie = new HashMap<>();

		while (line != null) {
			if (mapSortie.containsKey(line)) {                            // Recherche si l'élément lu est présent dans la map
				mapSortie.computeIfPresent(line, (key, val) -> val + 1);        // Incrementation de 1 si l'élémént est présent
				System.out.println(mapSortie);                                // Verification : ce qui se passe à chaque boucle (à supprimer à la fin)
			} else {                                                            // Creation de l'élément dans la map et incrementation de 1 si l'élément n'est pas present
				mapSortie.put(line, 1);
			}
			line = reader.readLine();
		}

		// Afficher
		FileWriter writer = new FileWriter("result.out");

		for (String key : mapSortie.keySet()) {
			Integer valeur = mapSortie.get(key);
			writer.write(key);
			writer.write(" ");
			writer.write(valeur + "\n");
		}
		writer.close();                            //Fermer le fichier
	*/
	}

}
