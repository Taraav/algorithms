package org.pg4200.ex04;

public class FibonacciImplMemoized implements Fibonacci{

    int[] x = new int[100];

    @Override
    public int compute(int n) throws IllegalArgumentException {
        if(n < 0){
            throw new IllegalArgumentException("Negative input: " + n);
        }

        if(n == 0 || n == 1){
            return n;
        }

        if(x[n] != 0){
            return x[n];
        }

        int num = compute(n - 1) + compute(n - 2);
        x[n] = num;

        return compute(n - 1) + compute(n -2);


    }
}
