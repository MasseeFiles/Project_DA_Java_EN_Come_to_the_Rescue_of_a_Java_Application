package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

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

	/*	public ArrayList<String> getSymptoms() {
		ArrayList<String> arraylistResult = new ArrayList<>();

	*/
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
