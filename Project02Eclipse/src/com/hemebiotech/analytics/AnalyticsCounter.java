package com.hemebiotech.analytics;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The AnalyticsCounter class is a tool designed to count
 * the symptoms from a raw list (input). The output is a
 * HashMap (string - integer) containing the symptoms as
 * keys and how many times they appear in the input list (value).
 * *
*/

public class AnalyticsCounter implements ISymptomCounter {
    private List<String> inputCount;

    public AnalyticsCounter(List<String> inputCount) {
        this.inputCount = inputCount;
    }

    @Override
    public Map<String, Integer> countSymptoms() {
        Map<String, Integer> outputCount = new HashMap<>();

        for (String s : inputCount) {
            if (outputCount.containsKey(s)) {
                outputCount.computeIfPresent(s, (key, val) -> val + 1);
            } else {
                outputCount.put(s, 1);
            }
        }
        return outputCount;
    }
}
