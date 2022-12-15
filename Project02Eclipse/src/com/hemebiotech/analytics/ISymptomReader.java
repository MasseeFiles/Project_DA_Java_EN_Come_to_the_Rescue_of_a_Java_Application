package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Anything that will read symptom data from a source
 * The important part is, the return value from the operation, which is a list of strings,
 * that may contain many duplications
 * 
 * The implementation does not need to order the list
 * 
 */
/* // On met dans l'interface la method pour lire un fichier
	BufferedReader reader = new BufferedReader (new FileReader("symptoms.txt"));
	String line = reader.readLine();
	Map<String, Integer> mapSortie = new HashMap<String, Integer>();   // chercher type de map  classement alphabetique
	/**
	 * If no data is available, return an empty List
	 * 
	 * @return a raw listing of all Symptoms obtained from a data source, duplicates are possible/probable
	 	List<String> GetSymptoms ();

}
*/
