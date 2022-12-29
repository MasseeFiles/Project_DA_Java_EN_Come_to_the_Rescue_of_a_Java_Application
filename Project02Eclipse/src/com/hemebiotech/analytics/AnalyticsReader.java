package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * The AnalyticsReader class is a tool designed to read and
 * store the symptoms from a .txt file (input). The output is an ArrayList
 * of strings containing all the symptoms reported is the input file.
 * *
 */

public class AnalyticsReader implements ISymptomReader {
private String filepath;
	/**
	 * @param filepath a full or partial path to file with symptom strings in it, one per line
	 */
	public AnalyticsReader (String filepath) {
		this.filepath = filepath;
	}

	@Override
	public List<String> getSymptoms() {
		List<String> listSymptoms = new ArrayList<>();

		if (filepath != null) {
			try {
				BufferedReader reader = new BufferedReader (new FileReader(filepath));
				String line = reader.readLine();

				while (line != null) {
					listSymptoms.add(line);
					line = reader.readLine();
				}
				reader.close();

			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return listSymptoms;
	}
}
