package com.vincegnv.arraysort;

/**
 * Created by Vince on 7/25/2014.
 */
public class BubbleSort extends Sort {
    @Override
    public void sortArray(int[] array) {
        boolean notSorted = true;

        while (notSorted) {
            notSorted = false;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    swapElements(array, i, i + 1);
                    notSorted = true;
                }
            }
        }
    }
}
