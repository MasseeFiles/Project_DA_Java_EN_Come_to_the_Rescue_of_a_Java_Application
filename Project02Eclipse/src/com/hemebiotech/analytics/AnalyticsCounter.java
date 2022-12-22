package com.hemebiotech.analytics;

import java.util.ArrayList;
import java.util.Map;

public class AnalyticsCounter {																			// Class principale : à renommer dans version finale
	public static void main(String[] args) throws Exception {

		ReadSymptomDataFromFile	file_Source = new ReadSymptomDataFromFile("symptoms.txt");		//création d'un objet file_Source - instanciation de la classe ReadSymptomDataFromFile
		ArrayList<String> list = file_Source.getSymptoms();												//appel de la method getSymptoms sur l'objet file_Source pour créer la list  - valeur retour est arraylist_result
				System.out.println(list);																// Verification : à supprimer dans version finale

		AnalyticsCounter2 count_Source = new AnalyticsCounter2(list);										//création d'un objet Count_Source - instanciation de la classe AnalyticsCounter2
		Map<String, Integer> mapSortie = count_Source.countSymptoms();										//appel de la method ISymptomCounter sur l'objet file_Source pour créer la list  - valeur retour est arraylist_result
			System.out.println(mapSortie);																// Verification : à supprimer dans version finale
																										//appel de la method ISymptomCounter sur l'objet count_Source - valeur retour est arraylist_result


	}

}
