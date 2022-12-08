package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.*;

public class AnalyticsCounter {
	public static void main(String []args) throws Exception {
		// Lire
		BufferedReader reader = new BufferedReader (new FileReader("symptoms.txt"));
		String line = reader.readLine();
		Map<String, Integer> mapSortie = new HashMap<String, Integer>();

		// Compter
		while (line != null) {
			if (mapSortie.containsKey(line)) {          					// Recherche si l'élément lu est présent dans la map
				mapSortie.computeIfPresent(line,(key,val) -> val + 1);		// Incrementation de 1 si l'élémént est présent
				System.out.println(mapSortie);								// Verification : ce qui se passe à chaque boucle (à supprimer à la fin)
			}
			else {															// Creation de l'élément dans la map et incrementation de 1 si l'élément n'est pas present
				mapSortie.put(line, 1);
			}
			line = reader.readLine();
		}

		// Afficher
		FileWriter writer = new FileWriter ("result.out");

		for (int i=0; i < mapSortie.size(); i++) {						// Boucle pour parcourir les éléments de la map
			writer.write(i.getKey () + "occurs" + i.getValue() + "time(s)");    //pb
			writer.write("\n");				//Passer une ligne
		}
		writer.close();							//Fermer le fichier
	}
}
