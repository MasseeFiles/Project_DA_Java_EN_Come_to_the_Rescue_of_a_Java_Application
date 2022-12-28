package com.hemebiotech.analytics;

import java.util.Map;

/**
 * Anything that will count symptom data from a given source.
 *
 * The important part is the return value from the operation,
 * which is a map of string-integer that does not contain duplications.
 * *
 */

public interface ISymptomCounter {
    Map<String, Integer> countSymptoms ();
}
