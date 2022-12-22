package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * La class ReadSymptomDataFromFile permet de permet de
 * créer une arraylist de string à partir du fichier indiqué par filepathphases d'execution.
 *
 */

public class ReadSymptomDataFromFile implements ISymptomReader {
private String filepath;
	/**
	 * 
	 * @param filepath a full or partial path to file with symptom strings in it, one per line
	 */
	public ReadSymptomDataFromFile (String filepath) {
		this.filepath = filepath;
	}

	@Override
	public ArrayList<String> getSymptoms() {
		ArrayList<String> arraylistResult = new ArrayList<>();
		
		if (filepath != null) {
			try {
				BufferedReader reader = new BufferedReader (new FileReader(filepath));
				String line = reader.readLine();

				while (line != null) {
					arraylistResult.add(line);
					line = reader.readLine();
				}
				reader.close();

			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return arraylistResult;
	}
}
