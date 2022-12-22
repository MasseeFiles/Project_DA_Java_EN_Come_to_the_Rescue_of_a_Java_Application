package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

/**
 * La class AnalyticsWriter permet
 * d'afficher dans un fichier .txt les données d'une
 * Map (string - integer)
 *
 */

public class AnalyticsWriter implements ISymptomWriter {
    private Map<String, Integer> inputMap;

    public AnalyticsWriter(Map<String, Integer> inputMap) {
       this.inputMap = inputMap;
    }

    @Override
    public void writeSymptoms() throws IOException {
        FileWriter writer = new FileWriter("result.out");

        for (String key : inputMap.keySet()) {
            Integer valeur = inputMap.get(key);
            writer.write(key);
            writer.write(" ");
            writer.write(valeur + "\n");
        }
        writer.close();
    }
}


