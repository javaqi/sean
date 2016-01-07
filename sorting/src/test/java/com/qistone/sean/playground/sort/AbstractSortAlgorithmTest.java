// Copyright (c) 2011 to 2013 eBay inc. All rights reserved.
package com.qistone.sean.playground.sort;

import org.junit.Before;
import org.junit.Test;
import org.unitils.reflectionassert.ReflectionAssert;

/**
 * defines the test cases to be run for sub class.
 */
public abstract class AbstractSortAlgorithmTest {

    protected SortAlgorithm sortAlgorithm;

    @Before
    public void init() {
        this.sortAlgorithm = this.initSortAlgorithm();
    }

    @Test
    public void test() {
        int[] input = { 4, 2, 9, 6, 23, 12, 34, 0, 1 };
        this.sortAlgorithm.sort(input);

        int[] expected = {0, 1, 2, 4, 6, 9, 12, 23, 34};
        ReflectionAssert.assertLenientEquals(expected, input);
    }

    @Test
    public void testSortedAlready() {
        int[] input = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        this.sortAlgorithm.sort(input);

        int[] expected = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        ReflectionAssert.assertLenientEquals(expected, input);
    }

    @Test
    public void testReverseSortedAlready() {
        int[] input = { 9, 8, 7, 6, 5, 4, 3, 2, 1 };
        this.sortAlgorithm.sort(input);

        int[] expected = { 9, 8, 7, 6, 5, 4, 3, 2, 1 };
        ReflectionAssert.assertLenientEquals(expected, input);
    }

    protected abstract SortAlgorithm initSortAlgorithm();

}
