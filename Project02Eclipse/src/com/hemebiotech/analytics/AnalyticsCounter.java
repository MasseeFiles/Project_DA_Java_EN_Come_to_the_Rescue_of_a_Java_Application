package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.*;


// but
public class AnalyticsCounter {
	public static void main(String []args) throws Exception {
		ReadSymptomDataFromFile ("symptoms.txt");			// appel de fonction qui lit le fichier .txt et créé la map
		Afficher ("mapSortie");								// appel de fonction qui convertit la map en fichier result.out







		BufferedReader reader = new BufferedReader (new FileReader("symptoms.txt"));
		String line = reader.readLine();
		Map<String, Integer> mapSortie = new HashMap<String, Integer>();   // chercher type de map  classement alphabetique

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


	private static void Afficher (String mapSortie) {
			String mapSortie
			FileWriter writer = new FileWriter ("result.out");
			Iterator<String> iterateur = mapSortie.keySet().iterator();		//utilisation d'un iterator (objet pour boucler dans une collection)
				while (iterateur.hasNext()) {
					String key = iterateur.next();
					Integer valeur = mapSortie.get(key);
					writer.write(key);
					writer.write(" ");
					writer.write(valeur + "\n");
			}
			writer.close();							//Fermer le fichier
		}




	}
}
