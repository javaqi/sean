package com.qistone.sean.playground.sort;

/**
 * bubble sort.
 */
public class SelectionSort extends AbstractSortAlgorithm {

    /**
     * bubble sort.
     */
    @Override
    public void doSort(final int[] input) {
        // each loop put the value in the right position.
        for (int i = 0; i < input.length - 1; i++) {
            int index = i;
            // find the smallest value.
            for (int j = i + 1; j < input.length; j++) {
                if (input[j] < input[index]) {
                    index = j;
                }
            }

            this.swap(i, index, input);
        }
    }
}
