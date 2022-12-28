package com.hemebiotech.analytics;

import java.io.IOException;

/**
 * Anything that will sort the input data (for
 * instance, alphabetically) and display them in a
 * relevant output (for instance, a .txt file).
 * *
 */

public interface ISymptomWriter {
    void writeSymptoms () throws IOException;
}
