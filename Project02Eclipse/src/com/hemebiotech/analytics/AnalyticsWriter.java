package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

/**
 * La class AnalyticsWriter permet
 * de classer par ordre alphabetique les données d'une hashmap (string - integer)
 * puis de les afficher dans un fichier .txt
 *
 */

public class AnalyticsWriter implements ISymptomWriter {
    private Map<String, Integer> inputMap;
    private TreeMap<String, Integer> mapOrdered = new TreeMap<String, Integer>();


    public AnalyticsWriter(Map<String, Integer> inputMap) {
       this.inputMap = inputMap;
    }

    @Override
    public void writeSymptoms() throws IOException {
        FileWriter writer = new FileWriter("result.out");

        mapOrdered.putAll(inputMap);


        for (String key : inputMap.keySet()) {
            Integer valeur = inputMap.get(key);
            writer.write(key);
            writer.write(" ");
            writer.write(valeur + "\n");
        }
        writer.close();
    }
}


