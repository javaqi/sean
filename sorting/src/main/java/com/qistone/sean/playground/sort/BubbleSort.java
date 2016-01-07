package com.qistone.sean.playground.sort;

/**
 * bubble sort.
 */
public class BubbleSort extends AbstractSortAlgorithm {

    /**
     * bubble sort.
     */
    @Override
    public void doSort(final int[] array) {
        this.debug("sort starts ..... ");
        int n = array.length;
        // at end of each loop the largest number in 0 - m positions is pushed to the right most position
        // of the 0 - m range.
        for (int m = n; m >= 0; m--) {
            // keep pushing the largest number to the right most position.
            for (int i = 0; i < n - 1; i++) {
                if (array[i] > array[i+1]) {
                    this.swap(i, i++, array);
                }
            }
            this.toStdOut(array);
        }
        this.debug("sort ends ..... ");
    }
}
