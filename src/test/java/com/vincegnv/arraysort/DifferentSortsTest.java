package com.vincegnv.arraysort;

import junit.framework.TestCase;

import java.util.Arrays;

public class DifferentSortsTest extends TestCase {

    private int[] array;
    private final String sortedArray = "[2, 2, 4, 6, 8, 80, 100]";
    private final String sortedArrayWithError = "[2, 4, 6, 8, 80, 100]";

    private void init(){
        this.array = new int[]{2, 8, 100, 6, 4, 80, 2};
    }

    public void testBubbleSort() throws Exception {
        init();
        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.sort(array);

        assertEquals(sortedArray, Arrays.toString(array));
    }

    public void testSelectionSortFindIndexOfMinimumValueMethod() throws Exception {
        init();
        SelectionSort sorter = new SelectionSort();

        assertEquals(6, sorter.findIndexOfMinimumValue(array, 1));
    }

   public void testSelectionSort() throws Exception {
        init();
        SelectionSort sorter = new SelectionSort();
        sorter.sort(array);

        assertEquals(sortedArray, Arrays.toString(array));
    }

    public void testInsertionSort() throws Exception {
        init();
        InsertionSort sorter = new InsertionSort();
        sorter.sort(array);

        assertEquals(sortedArray, Arrays.toString(array));
    }

    public void testMergeSortMergeMethod() throws Exception {
        MergeSort sorter = new MergeSort();
        int[] a1 = new int[]{3,6,8};
        int[] a2 = new int[]{5,7,9};

        assertEquals("[3, 5, 6, 7, 8, 9]", Arrays.toString(sorter.merge(a1, a2)));
    }

    public void testMergeSortMergeSortMethod() throws Exception {
        init();
        MergeSort sorter = new MergeSort();
        array = sorter.mergeSort(array);

        assertEquals(sortedArray, Arrays.toString(array));
    }

    public void testMergeSort() throws Exception {
        init();
        MergeSort sorter = new MergeSort();
        sorter.sort(array);

        assertEquals(sortedArray, Arrays.toString(array));
    }
}