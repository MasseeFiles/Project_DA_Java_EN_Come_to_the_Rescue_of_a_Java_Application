package com.hemebiotech.analytics;

import java.util.List;

/**
 * Anything that will read symptom data from a given source.
 *
 * The important part is the return value from the operation,
 * which is a list of strings that may contain duplications.
 * *
 */

public interface ISymptomReader {
	List<String> getSymptoms ();
}
