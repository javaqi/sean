package com.qistone.sean.playground.sort;

import org.junit.Assert;
import org.junit.Test;


/**
 * tests {@link SelectionSort}.
 */
public class SelectionSortTest extends AbstractSortAlgorithmTest {

    @Override
    protected SortAlgorithm initSortAlgorithm() {
        return new SelectionSort();
    }

    @Test
    public void makeSureSortingIsCorrect() {
        Assert.assertTrue(this.sortAlgorithm instanceof SelectionSort);
    }
}
