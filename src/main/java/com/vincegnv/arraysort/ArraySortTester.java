package com.vincegnv.arraysort;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by Vince on 7/27/2014.
 */
public class ArraySortTester extends ArraySort{
    private String bubbleSortResult;
    private String selectionSortResult;
    private String insertionSortResult;
    private String quickSortResult;
    private String mergeSortResult;
    private String arraysSortResult;

    long bubbleSortTime;
    long selectionSortTime;
    long insertionSortTime;
    long quickSortTime;
    long mergeSortTime;
    long arraysSortTime;
    private int[] array;

    public ArraySortTester(){
        bubbleSortResult = "";
        selectionSortResult = "";
        insertionSortResult = "";
        quickSortResult = "";
        mergeSortResult = "";
        bubbleSortTime = 0;
        selectionSortTime = 0;
        insertionSortTime = 0;
        quickSortTime = 0;
        mergeSortTime = 0;
        array = null;
    }

    public void printTestResults(int arraySize){
        test(arraySize);
        System.out.print(checkForSortErrorsAndSortTimes());
    }

    protected String checkForSortErrorsAndSortTimes(){
        StringBuilder message = new StringBuilder();

        message.append(String.format("Arrays.sort did it in %d milliseconds.\n", arraysSortTime));
        if(arraysSortResult.compareTo(bubbleSortResult) != 0 ){
            message.append("Bubble Sort Error\n");
        } else{
            message.append(String.format("Bubble Sort did it in %d milliseconds.\n", bubbleSortTime));
        }
        if(arraysSortResult.compareTo(selectionSortResult) != 0 ){
            message.append("Selection Sort Error\n");
        } else{
            message.append(String.format("Selection Sort did it in %d milliseconds.\n", selectionSortTime));
        }
        if(arraysSortResult.compareTo(insertionSortResult) != 0 ){
            message.append("Insertion Sort Error\n");
        } else{
            message.append(String.format("Insertion Sort did it in %d milliseconds.\n", insertionSortTime));
        }
        if(arraysSortResult.compareTo(quickSortResult) != 0 ){
            message.append("Quick Sort Error\n");
        } else{
            message.append(String.format("Quick Sort did it in %d milliseconds.\n", quickSortTime));
        }
        if(arraysSortResult.compareTo(mergeSortResult) != 0 ){
            message.append("Merge Sort Error\n");
        } else{
            message.append(String.format("Merge Sort did it in %d milliseconds.\n", mergeSortTime));
        }

        return message.toString();
    }

    protected void test(int arraySize){
        array = generateRandomArray(arraySize);
        StopWatch timer = new StopWatch();

        int[] workArray = array;
        timer.start();
        bubbleSort(workArray);
        bubbleSortTime = timer.timeInMilliSeconds();
        bubbleSortResult = Arrays.toString(workArray);

        workArray = array;
        timer.start();
        selectionSort(workArray);
        selectionSortTime = timer.timeInMilliSeconds();
        selectionSortResult = Arrays.toString(workArray);

        workArray = array;
        timer.start();
        insertionSort(workArray);
        insertionSortTime = timer.timeInMilliSeconds();
        insertionSortResult = Arrays.toString(workArray);

        workArray = array;
        timer.start();
        quickSort(workArray);
        quickSortTime = timer.timeInMilliSeconds();
        quickSortResult = Arrays.toString(workArray);

        workArray = array;
        timer.start();
        mergeSort(workArray);
        mergeSortTime = timer.timeInMilliSeconds();
        mergeSortResult = Arrays.toString(workArray);

        workArray = array;
        timer.start();
        Arrays.sort(workArray);
        arraysSortTime = timer.timeInMilliSeconds();
        arraysSortResult = Arrays.toString(workArray);
    }

    protected int[] generateRandomArray(int arraySize){
        Random numberGenerator = new Random();
        int[] array = new int[arraySize];
        for(int i = 0; i < arraySize; i++){
            array[i] = numberGenerator.nextInt(arraySize);
        }

        return array;
    }
}
