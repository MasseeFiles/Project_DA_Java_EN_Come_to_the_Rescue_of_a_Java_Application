package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

/**
 * The AnalyticsWriter class is a tool designed to sort
 * alphabetically the symptoms from a HashMap (input) and write
 * them with their occurence in a .txt file (output).
 * *
 */

public class AnalyticsWriter implements ISymptomWriter {
    private Map<String, Integer> inputMap;

    // TreeMap class is used because it automatically sorts entries based on the natural ordering of the keys (alphabetical for strings)
    private TreeMap<String, Integer> mapOrdered = new TreeMap<>();

    public AnalyticsWriter(Map<String, Integer> inputMap) {
        this.inputMap = inputMap;
    }

    @Override
    public void writeSymptoms() throws IOException {
        FileWriter writer = new FileWriter("result.out");

        mapOrdered.putAll(inputMap);

        for (String key : mapOrdered.keySet()) {
            Integer valeur = mapOrdered.get(key);
            writer.write(key);
            writer.write(" ");
            writer.write(valeur + "\n");
        }
        writer.close();
    }
}


