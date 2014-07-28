package com.vincegnv.arraysort;

/**
 * Created by Vince on 7/26/2014.
 */
public class InsertionSort extends Sort {
    @Override
    public void sortArray(int[] array) {
        for(int forwardIndex = 1; forwardIndex<array.length; forwardIndex++) {
            int reverseIndex = forwardIndex;
            while(reverseIndex > 0 && array[reverseIndex] < array[reverseIndex - 1]){
                swapElements(array, reverseIndex, reverseIndex - 1);
                reverseIndex--;
            }
        }
    }
}
