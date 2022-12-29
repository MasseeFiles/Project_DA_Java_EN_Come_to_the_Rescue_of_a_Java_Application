package com.hemebiotech.analytics;

import java.io.IOException;

/**
 * Interface used to sort input data (for
 * instance, alphabetically) and display them in a
 * relevant file (for instance, .txt).
 * *
 */

public interface ISymptomWriter {
    void writeSymptoms () throws IOException;
}
