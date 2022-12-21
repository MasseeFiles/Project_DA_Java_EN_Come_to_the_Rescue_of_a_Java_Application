package com.hemebiotech.analytics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// La class AnalyticsCounter2 permet de créer une map à partir d'une Arraylist de string

public class AnalyticsCounter2 implements ISymptomCounter {
    private ArrayList<String> input_ArrayList;
    private Map<String, Integer> output_Map;  // = new HashMap<>();

    public AnalyticsCounter2(ArrayList<String> input_ArrayList) {                  // Constructeur pour les objets AnalyticsCounter2
        this.input_ArrayList = input_ArrayList;
    }

    @Override                                                                           // Précise pour la class AnalyticsCounter2 le comportement de countSymptoms (interface)
    public Map<String, Integer> countSymptoms() {
        Map<String, Integer> output_Map = new HashMap<>();                          // Appel de constructeur pour creer l'objet output_Map

        for (int i = 0; i < input_ArrayList.size(); i++) {                          //boucle pour parcourir la list
            if (output_Map.containsKey(input_ArrayList.get(i))) {                                     // Recherche si l'élément d'index i est présent dans la map
                output_Map.computeIfPresent(input_ArrayList.get(i), (key, val) -> val + 1);           // Incrementation de 1 si l'élémént est présent
                System.out.println(output_Map);                                     // Verification : ce qui se passe à chaque boucle (à supprimer à la fin)
            } else {                                                                // Creation de l'élément dans la map et incrementation de 1 si pas present
                output_Map.put(input_ArrayList.get(i), 1);
            }
        }
        return output_Map;                                            //retour de la list à la class appelante
    }
}
/*

        while (line != null) {                                                      //boucle pour parcourir la list
            if (output_Map.containsKey(line)) {                                     // Recherche si l'élément lu est présent dans la map
                output_Map.computeIfPresent(line, (key, val) -> val + 1);           // Incrementation de 1 si l'élémént est présent
                System.out.println(output_Map);                                     // Verification : ce qui se passe à chaque boucle (à supprimer à la fin)
            } else {                                                                // Creation de l'élément dans la map et incrementation de 1 si l'élément n'est pas present
                output_Map.put(line, 1);
            }
            line = reader.readLine();
        }
        return output_Map;											                //retour de la map à la class appelante
    }

//   FileWriter writer = new FileWriter("result.out");

/*
		BufferedReader reader = new BufferedReader(new FileReader("symptoms.txt"));


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


