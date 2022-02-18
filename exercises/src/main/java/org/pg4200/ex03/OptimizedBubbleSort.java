package org.pg4200.ex03;

import java.util.Comparator;

public class OptimizedBubbleSort {
    public <T> int sort(T[] array, Comparator<T> comparator, boolean optimized){

        if (array == null) {
            return 0;
        }

        int sum = 0;

        boolean swapped = true;

        //comparator.compare(x, y);

        while(swapped){
            swapped = false;

            for(int i = 0; i < array.length - 1; i ++){
                int j = i + 1;

                sum ++;

                if(comparator.compare(array[i], array[j]) > 0){
                    T tmp = array[i];
                    array[i] = array[j];
                    array[j] = tmp;

                    swapped = true;
                }

            }
        }
        return sum;
    }
}
