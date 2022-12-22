package com.hemebiotech.analytics;

import java.util.ArrayList;
import java.util.Map;

/**
 * La class Launcher permet de lancer le programme (Method main)
 * et d'appeler les methodes nécessaires aux differentes phases d'execution.
 *
 */

public class Launcher {

	public static void main(String[] args) throws Exception {

		ReadSymptomDataFromFile	fileSource = new ReadSymptomDataFromFile("symptoms.txt");
		ArrayList<String> outputList = fileSource.getSymptoms();

		AnalyticsCounter countSource = new AnalyticsCounter(outputList);
		Map<String, Integer> outputMap = countSource.countSymptoms();

		AnalyticsWriter writeSource = new AnalyticsWriter(outputMap);
		writeSource.writeSymptoms();
	}
}
