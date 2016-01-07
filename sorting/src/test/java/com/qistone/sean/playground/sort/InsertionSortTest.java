package com.qistone.sean.playground.sort;

import org.junit.Assert;
import org.junit.Test;


/**
 * tests {@link InsertionSort}.
 */
public class InsertionSortTest extends AbstractSortAlgorithmTest {

    @Override
    protected SortAlgorithm initSortAlgorithm() {
        return new InsertionSort();
    }


    @Test
    public void makeSureSortingIsCorrect() {
        Assert.assertTrue(this.sortAlgorithm instanceof InsertionSort);
    }
}
