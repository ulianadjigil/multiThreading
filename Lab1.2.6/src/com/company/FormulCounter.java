package com.company;

public class FormulCounter extends Counter {

    public FormulCounter(long start, long step, long amount) {
        super(start, step, amount);
    }

    @Override
    public void run() {
        result = formul(start, step, amount);
    }

    public long formul(long start, long step,  long N){
        long s = (long) ((start * (N+1)) * 0.5 * N);
        return s;
    }
}
