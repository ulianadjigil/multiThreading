package com.company;

public class Counter implements Runnable {

    long start;
    long step;
    long amount;

    long result;

    public Counter(long start, long step, long amount) {
        this.step = step;
        this.start = start;
        this.amount = amount;
    }

    @Override
    public void run() {
        result = threadCycle(start, step, amount);
    }


    public long threadCycle(long start, long step, long N){
        long s = 0;
        for (long k = 1; k<= N; k++){
            s = s + start;
            start = start + step;
        }
        return s;
    }
}
