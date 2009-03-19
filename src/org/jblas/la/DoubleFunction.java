package org.jblas.la;

/**
 * Represents a function on doubles.
 */
public interface DoubleFunction {
        /** Compute the function. */
	public double compute(double x);
}