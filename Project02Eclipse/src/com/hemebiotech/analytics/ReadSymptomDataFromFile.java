package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

// La class ReadSymptomDataFromFile permet de créer une arraylist de string à partir du fichier indiqué par filepath

/**
 * Simple brute force implementation
 *
 */
public class ReadSymptomDataFromFile implements ISymptomReader {
private String filepath;									//l'attribut filepath indique juste un chemin d'acces sous forme de string
	/**
	 * 
	 * @param filepath a full or partial path to file with symptom strings in it, one per line
	 */
	public ReadSymptomDataFromFile (String filepath) {			//constructeur avec filepath en parametre
		this.filepath = filepath;								//this.filepath fait reference à l'attribut de la classe ReadSymptomDataFromFile (ligne 16)
	} //

	@Override													//précise pour la class ReadSymptomDataFromFile le comportement de getSymptoms (interface)
	public ArrayList<String> getSymptoms() {							//ArrayList<String> correspond a la valeur de retour de la method getSymptoms
		ArrayList<String> arraylistResult = new ArrayList<>();		//Appel de constructeur pour creer l'objet arraylistResult (arraylist de string: taille modifiable - ok nouvelles données)
		
		if (filepath != null) {									//acces au fichier pointé par filepath
			try {												//gestion des exceptions - cas normal
				BufferedReader reader = new BufferedReader (new FileReader(filepath));
				String line = reader.readLine();
				
				while (line != null) {							//boucle pour parcourir le fichier source
					arraylistResult.add(line);							//ajout de nouvel element dans arraylistResult
					line = reader.readLine();					//lecture ligne par ligne
				}

				reader.close();									// fin de consultation du fichier source
			} catch (IOException e) {							//gestion des exceptions - code a executer si pb avec les données lues dans filepath
				e.printStackTrace();							//methode pour localiser l'exception (class, ligne...)
			}
		}
		// inserer method sort pour classement alphabetique?
		return arraylistResult;											//retour de la list à la class appelante
	}
}
