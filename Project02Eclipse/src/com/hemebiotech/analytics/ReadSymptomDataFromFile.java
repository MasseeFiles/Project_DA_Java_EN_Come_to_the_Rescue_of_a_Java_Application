package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

// Le but de ReadSymptomDataFromFile est de creer une list de string à partir du fichier indiqué par filepath

/**
 * Simple brute force implementation
 *
 */
public class ReadSymptomDataFromFile implements ISymptomReader {

	private String filepath;									//filepath indique juste un chemin d'acces
	
	/**
	 * 
	 * @param filepath a full or partial path to file with symptom strings in it, one per line
	 */
	public ReadSymptomDataFromFile (String filepath) {			//constructeur avec filepath en parametre
		this.filepath = filepath;								//this.filepath fait reference à l'attribut de l'objet à créer (objet ReadSymptomDataFromFile)
	}															// ... et filepath fait reference au parametre du constructeur

	@Override													//précise pour la class ReadSymptomDataFromFile le comportement de getsymptoms
	public List<String> GetSymptoms() {							//List<String> correspond a la valeur de retour de la method GetSymptoms
		ArrayList<String> result = new ArrayList<>();		//Appel de constructeur pour creer l'objet result (arraylist de string)
		
		if (filepath != null) {
			try {												//gestion des exceptions - cas normal
				BufferedReader reader = new BufferedReader (new FileReader(filepath));
				String line = reader.readLine();
				
				while (line != null) {							//boucle pour parcourir le fichier de symptoms
					result.add(line);							//ajout de nouvel element dans result
					line = reader.readLine();
				}
				reader.close();
			} catch (IOException e) {							//gestion des exceptions - code a executer si erreur
				e.printStackTrace();
			}
		}
		
		return result;
	}

}
