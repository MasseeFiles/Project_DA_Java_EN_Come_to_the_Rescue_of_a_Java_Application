package com.hemebiotech.analytics;

import java.util.ArrayList;
import java.util.Map;

/**
 * * The Launcher class is used to launch the program and
 * call up the methods needed to perform its processing tasks.
 * *
 */

public class Launcher {

	public static void main(String[] args) throws Exception {

		AnalyticsReader	fileSource = new AnalyticsReader("symptoms.txt");
		ArrayList<String> outputList = fileSource.getSymptoms();

		AnalyticsCounter countSource = new AnalyticsCounter(outputList);
		Map<String, Integer> outputMap = countSource.countSymptoms();

		AnalyticsWriter writeSource = new AnalyticsWriter(outputMap);
		writeSource.writeSymptoms();
	}
}
