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
    private List<String> inputArraylist;

    public AnalyticsCounter(List<String> inputArrayList) {
        this.inputArraylist = inputArrayList;
    }

    @Override
    public Map<String, Integer> countSymptoms() {
        Map<String, Integer> outputMap = new HashMap<>();

        for (String s : inputArraylist) {           // same as : for (int i = 0; i < inputArraylist.size(); i++) {
            if (outputMap.containsKey(s)) {
                outputMap.computeIfPresent(s, (key, val) -> val + 1);
            } else {
                outputMap.put(s, 1);
            }
        }
        return outputMap;
    }
}
