package com.hemebiotech.analytics;

import java.util.Map;

/**
 * Interface used to count symptom data from any given source.
 *
 * The important part is the return value from the operation,
 * which is a map of string-integer that does not contain duplications.
 * *
 */

public interface ISymptomCounter {
    Map<String, Integer> countSymptoms ();
}
