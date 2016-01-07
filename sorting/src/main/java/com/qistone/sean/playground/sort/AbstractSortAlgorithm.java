// Copyright (c) 2011 to 2013 eBay inc. All rights reserved.
package com.qistone.sean.playground.sort;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Provides logging functionalities.
 */
public abstract class AbstractSortAlgorithm implements SortAlgorithm {

    private final Logger logger;

    /**
     * init {@link #logger}.
     */
    protected AbstractSortAlgorithm() {
        super();
        this.logger = LoggerFactory.getLogger(this.getClass());
    }

    @Override
    public final void sort(final int[] input) {
        long startTime = System.currentTimeMillis();
        this.doSort(input);
        long endTime = System.currentTimeMillis();
        this.debug(this.getClass().getSimpleName() + " takes ", (endTime - startTime), " ms");
    }

    protected abstract void doSort(final int[] input);

    /**
     * Swap the values at position i and j.
     *
     * @param i index position to be swapped with
     * @param j index position to be swapped with
     * @param array array of ints.
     */
    protected void swap(final int i, final int j, final int[] array) {
        int temp;
        temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    /**
     * If (@link {@link Logger#isDebugEnabled()} returns flase, do nothing.
     *
     * @param toBeLoggeds to be logged if debug is turned on.
     */
    protected void debug(final Object... toBeLoggeds) {
        if (!this.logger.isDebugEnabled()) {
            return;
        }
        this.logger.debug(this.buildString(toBeLoggeds));
    }

    /**
     * If (@link {@link Logger#isDebugEnabled()} returns flase, do nothing.
     *
     * @param toBeLoggeds to be logged if debug is turned on.
     */
    protected void info(final Object... toBeLoggeds) {
        if (!this.logger.isInfoEnabled()) {
            return;
        }
        this.logger.info(this.buildString(toBeLoggeds));
    }

    /**
     * @param toBeLoggeds objects to be logged.
     * @return String representation of the objects to be logged.
     */
    private String buildString(final Object... toBeLoggeds) {
        StringBuilder sb = new StringBuilder();
        for (Object toBeLogged : toBeLoggeds) {
            sb.append(toBeLogged);
        }
        sb.append(System.getProperty("line.separator"));
        return sb.toString();
    }

    /**
     * @param input to be output to Stdout
     */
    protected void toStdOut(int[] input) {

        for (int i = 0; i < input.length; i++) {
            System.out.print(input[i] + ", ");
        }
        System.out.println("\n");
    }
}
