package com.hemebiotech.analytics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * La class AnalyticsCounter permet
 * de créer une map à partir d'une Arraylist de string
 *
*/

public class AnalyticsCounter implements ISymptomCounter {
    private ArrayList<String> inputArraylist;

    public AnalyticsCounter(ArrayList<String> input_ArrayList) {
        this.inputArraylist = input_ArrayList;
    }

    @Override
    public Map<String, Integer> countSymptoms() {
        Map<String, Integer> outputMap = new HashMap<>();

        for (int i = 0; i < inputArraylist.size(); i++) {
            if (outputMap.containsKey(inputArraylist.get(i))) {
                outputMap.computeIfPresent(inputArraylist.get(i), (key, val) -> val + 1);
            } else {
                outputMap.put(inputArraylist.get(i), 1);
            }
        }
        return outputMap;
    }
}
