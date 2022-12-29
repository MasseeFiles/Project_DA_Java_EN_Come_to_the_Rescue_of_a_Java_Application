package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;

/**
 * * The Launcher class is used to launch the program and
 * call up the methods needed to perform its process.
 *
 * Interfaces are used rather than implementation
 */

public class Launcher {
	public static void main(String[] args) throws Exception {

		ISymptomReader fileSource = new AnalyticsReader("symptoms.txt");
		List<String> outputList = fileSource.getSymptoms();

		ISymptomCounter countSource = new AnalyticsCounter(outputList);
		Map<String, Integer> outputMap = countSource.countSymptoms();

		ISymptomWriter writeSource = new AnalyticsWriter(outputMap);
		writeSource.writeSymptoms();
	}
}
