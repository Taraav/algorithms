package org.pg4200.ex04;

public class FibonacciImpl implements Fibonacci{
    @Override
    public int compute(int n) throws IllegalArgumentException {

        if(n < 0){
            throw new IllegalArgumentException("Invalid negative value: " + n);
        }

        // exit condition, kjører til vi treffer denne.
        if(n == 0 || n == 1){
            return n;
        }

        return compute(n - 2) + compute(n - 1);
    }
}
