package com.vincegnv.arraysort;

import java.util.Arrays;

/**
 * Created by Vince on 7/26/2014.
 */
public class SelectionSort extends Sort {
    @Override
    public void sortArray(int[] array) {
        for (int i = 0; i < array.length-1; i++) {
            int minimumValueIndex = findIndexOfMinimumValue(array, i);
            if(minimumValueIndex != i) {
                swapElements(array, i, minimumValueIndex);
            }
        }
    }

    protected int findIndexOfMinimumValue(int[] array, int i) {
        int minimumValueIndex = i;
        for(int j = i+1; j < array.length; j++) {
            if (array[minimumValueIndex] > array[j]) {
                minimumValueIndex = j;
            }
        }
        return minimumValueIndex;
    }

}
