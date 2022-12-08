package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Map;				//pour utiliser Map
import java.util.HashMap;			//pour utiliser Map
import java.util.ArrayList;			//pour utiliser List
import java.util.Collections;		//pour utiliser frequency

public class AnalyticsCounter {
	public static void main(String[] args) throws Exception {
			/* lancer class LIRE sur symptoms.txt
				source : symptoms.txt - resultat : listSymptoms
			puis lancer class COMPTER sur listSymptoms
				source : listSymptoms - resultat : mapSortie
			puis lancer class AFFICHER sur mapSortie
				source : map_sortie - resultat : result.out
			 */

		// class Lire

		BufferedReader reader = new BufferedReader(new FileReader("symptoms.txt"));	   		// transmission du chemin du fichier à lire à class Bufferedreader
		List<String> listSymptoms = new ArrayList<String>();
		// pb : faire lien entre reader et listSymptoms
		String line = reader.readLine();  					 // method readline lit les lignes une par une
		line = reader.readLine();	// get another symptom
	}

	class Compter {
		private ArrayList<String> listSymptoms = new ArrayList<String>();
		private Map<String, Integer> mapSortie = new HashMap<String, Integer>();
		private int headCount = Collections.frequency(listSymptoms, "headache");
		private int rashCount = Collections.frequency(listSymptoms, "rash");
		private int pupilCount = Collections.frequency(listSymptoms, "pupils");

		// remplissage des données de la map
			mapSortie.put ("headache", headCount);
			mapSortie.put ("rash", rashCount);
			mapSortie.put ("pupils", pupilCount);
	}

		/* test class Compter avec boucle for
			private Map<String, Integer> map_sortie = new HashMap<String, Integer>();
			private static int headCount = 0;
			private static int rashCount = 0;
			private static int pupilCount = 0;

			// pb : recuperation d'un element de la liste (avec son index) pour le mettre dans la map


			for (int i = 0; i < listSymptoms.size; i++ ) {
				if (listSymptoms.get(i).equals("headache")) {
				headCount++;
				}
				else if (listSymptoms.get(i).equals("rash")) {
				rashCount++;
				}
				else if (listSymptoms.get(i).contains("pupils")) {            //Counts all elements related to pupils (constricted or dilated)
				pupilCount++;
				}
			}
		*/

	//class Afficher : utilisation des method (keyset et values) ou (entryset)
	FileWriter writer = new FileWriter ("result.out");
			writer.write("headache: " + headCount + "\n");
			writer.write("rash: " + rashCount + "\n");
			writer.write("dialated pupils: " + pupilCount + "\n");
			writer.close();
}
}
test modif refactoring v2

