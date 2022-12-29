package com.hemebiotech.analytics;

import java.util.List;

/**
 * Interface used to read symptom data from any given source.
 *
 * The important part is the return value from the operation,
 * which is a list of strings that may contain duplications.
 * *
 */

public interface ISymptomReader {
	List<String> getSymptoms ();
}
