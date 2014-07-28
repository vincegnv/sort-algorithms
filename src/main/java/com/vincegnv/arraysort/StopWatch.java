package com.vincegnv.arraysort;

/**
 * Created by Vince on 7/1/2014.
 * Used to measure the elapsed time
 */
public class StopWatch {
    private long startTimeNano;
    private long startTimeMilli;
    private String mode;

    public StopWatch(){}

    public void start(){
        this.startTimeNano = System.nanoTime();
        this.startTimeMilli = System.currentTimeMillis();
    }


    public long timeInNanoSeconds(){
        return System.nanoTime() - startTimeNano;
    }

    public long timeInMilliSeconds(){
        return System.currentTimeMillis() - startTimeMilli;
    }

}
