package com.vincegnv.arraysort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by Vince on 7/26/2014.
 */
public class QuickSort extends Sort{

    @Override
    public void sortArray(int[] array) {
        quickSort(array, 0, array.length - 1);
    }

    protected void quickSort(int[] array, int startIndex, int endIndex){
        if(startIndex < endIndex){
            int partitionIndex = partition(array, startIndex, endIndex);
            quickSort(array, startIndex, partitionIndex);
            quickSort(array, partitionIndex + 1, endIndex);
        }
    }

    protected int partition(int[] array, int startIndex, int endIndex) {

        int pivot = pickPivot(Arrays.copyOfRange(array, startIndex, endIndex));
        int left = startIndex-1 ;
        int right = endIndex+1 ;

        while (true) {
            left++;
            while ( left< endIndex && array[left] < pivot) {
                left++;
            }
            right--;
            while (right>startIndex && array[right] > pivot) {
                right--;
            }
            if (left < right)
                swapElements(array, left, right);
            else
                return right;
        }
    }

    protected int pickPivot(int[]array){
        int pivot = 0;
        if(array.length > 0){
            pivot = array[0];
            if(array.length > 2){
                List<Integer> sorter = new ArrayList<Integer>();
                sorter.add(array[0]);
                sorter.add(array[array.length/2]);
                sorter.add(array[array.length - 1]);
                Collections.sort(sorter);
                pivot = sorter.get(1);
            }
        }
        return pivot;
    }
}
