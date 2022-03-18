package org.pg4200.ex01;

import java.util.Arrays;

public class ArrayUtilsImp implements ArrayUtils{
    @Override
    public int min(int[] array) throws IllegalArgumentException {
        checkArray(array);

        Arrays.sort(array);
        return array[0];
    }

    @Override
    public int max(int[] array) throws IllegalArgumentException {
        checkArray(array);

        Arrays.sort(array);
        return array[array.length - 1];
    }

    @Override
    public double mean(int[] array) throws IllegalArgumentException {
        checkArray(array);

        double total = 0;

        for(int i = 0; i < array.length; i ++){
            total = total + array[i];
        }

        return total / array.length;
    }

    private void checkArray(int[] array) {
        if(array == null || array.length == 0){
            throw new IllegalArgumentException("invalid empty array.");
        }
    }
}
