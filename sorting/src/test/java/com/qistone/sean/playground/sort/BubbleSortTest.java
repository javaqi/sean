package com.qistone.sean.playground.sort;

import org.junit.Assert;
import org.junit.Test;


/**
 * tests {@link BubbleSort}.
 */
public class BubbleSortTest extends AbstractSortAlgorithmTest {

    @Override
    protected SortAlgorithm initSortAlgorithm() {
        return new BubbleSort();
    }

    @Test
    public void makeSureSortingIsCorrect() {
        Assert.assertTrue(this.sortAlgorithm instanceof BubbleSort);
    }
}
