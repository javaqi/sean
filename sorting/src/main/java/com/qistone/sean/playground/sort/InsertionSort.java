package com.qistone.sean.playground.sort;

/**
 * bubble sort.
 */
public class InsertionSort extends AbstractSortAlgorithm {

    /**
     * bubble sort.
     */
    @Override
    public void doSort(final int[] input) {
        for (int i = 1; i < input.length; i++) {
            for (int j = i; j > 0; j--) {
                if (input[j] < input[j - 1]) {
                    this.swap(j, j-1, input);
                }
            }
            this.toStdOut(input);
        }
    }
}
