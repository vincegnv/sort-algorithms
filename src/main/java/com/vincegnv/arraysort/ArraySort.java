package com.vincegnv.arraysort;

/**
 * Created by Vince on 7/25/2014.
 */
public class ArraySort {
    private static SelectionSort selectionSort;
    private static BubbleSort bubbleSort;
    private static QuickSort quickSort;
    private static InsertionSort insertionSort;
    private static MergeSort mergeSort;

    public static void bubbleSort(int[] array){
        if(bubbleSort == null){
            bubbleSort = new BubbleSort();
        }
        bubbleSort.sort(array);
    }

    public static void quickSort(int[] array){
        if(quickSort == null){
            quickSort = new QuickSort();
        }
        quickSort.sort(array);
    }

    public static void selectionSort(int[] array){
        if(selectionSort == null){
            selectionSort = new SelectionSort();
        }
        selectionSort.sort(array);
    }

    public static void insertionSort(int[] array){
        if(insertionSort == null){
            insertionSort = new InsertionSort();
        }
        selectionSort.sort(array);
    }

    public static void mergeSort(int[] array){
        if(mergeSort == null){
            mergeSort = new MergeSort();
        }
        mergeSort.sort(array);
    }

}
