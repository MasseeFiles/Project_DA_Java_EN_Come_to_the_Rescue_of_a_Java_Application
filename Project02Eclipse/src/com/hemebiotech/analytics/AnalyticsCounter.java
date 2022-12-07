package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public class AnalyticsCounter {
	private static int headCount = 0;
	private static int rashCount = 0;
	private static int pupilCount = 0;

	public static void main(String []args) throws Exception {
		// first get input from file symptoms.txt
		BufferedReader reader = new BufferedReader (new FileReader("symptoms.txt"));
		String line = reader.readLine();

		//loop to analyse the list provided by Symptoms.txt
		while (line != null) {
			if (line.equals("headache")) {
				headCount++;
			}
			else if (line.equals("rash")) {
				rashCount++;
			}
			else if (line.contains("pupils")) {			//Counts all elements related to pupils (constricted or dilated)
				pupilCount++;
			}
			line = reader.readLine();
		}

		FileWriter writer = new FileWriter ("result.out");
		writer.write("headache: " + headCount + "\n");
		writer.write("rash: " + rashCount + "\n");
		writer.write("dialated pupils: " + pupilCount + "\n");
		writer.close();
	}
}

