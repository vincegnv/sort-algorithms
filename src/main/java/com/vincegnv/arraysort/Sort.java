package com.vincegnv.arraysort;

/**
 * Created by Vince on 7/25/2014.
 */
public abstract class Sort {
    public void sort(int[] array){
        if(array.length > 1){
            sortArray(array);
        }
    }

    protected abstract void sortArray(int[] array);

    protected void swapElements(int[] array, int index1, int index2){
        array[index1] = array[index1]^array[index2];
        array[index2] = array[index1]^array[index2];
        array[index1] = array[index1]^array[index2];
    }
}
