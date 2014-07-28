package com.vincegnv.arraysort;

import java.util.Arrays;

/**
 * Created by Vince on 7/26/2014.
 */
public class MergeSort extends Sort {
    @Override
    protected void sortArray(int[] array) {
        int[] tempArray = mergeSort(array);
        for(int i = 0; i < array.length; i++){
            array[i] = tempArray[i];
        }
    }

    protected int[] mergeSort(int[] array) {
        if(array.length < 2){
            return array;
        }
        int middleIndex = array.length/2;
        int[] leftArray = mergeSort(Arrays.copyOfRange(array, 0, middleIndex));
        int[] rightArray = mergeSort(Arrays.copyOfRange(array, middleIndex, array.length));

        return merge(leftArray, rightArray);
    }

    protected int[] merge(int[] leftArray, int[] rightArray) {
        int[] mergedArray = new int[leftArray.length+rightArray.length];
        int leftArrayIndex = 0, rightArrayIndex = 0;

        while(leftArrayIndex < leftArray.length && rightArrayIndex < rightArray.length){
            if(leftArray[leftArrayIndex] < rightArray[rightArrayIndex]){
                mergedArray[leftArrayIndex+rightArrayIndex] = leftArray[leftArrayIndex];
                leftArrayIndex++;
            } else{
                mergedArray[leftArrayIndex+rightArrayIndex] = rightArray[rightArrayIndex];
                rightArrayIndex++;
            }
        }
        if(leftArrayIndex<leftArray.length){
            System.arraycopy(leftArray, leftArrayIndex, mergedArray, leftArrayIndex+rightArrayIndex, leftArray.length-leftArrayIndex);
        } else if(rightArrayIndex < rightArray.length){
            System.arraycopy(rightArray, rightArrayIndex, mergedArray, leftArrayIndex+rightArrayIndex, rightArray.length-rightArrayIndex);
        }

        return mergedArray;
    }
}
