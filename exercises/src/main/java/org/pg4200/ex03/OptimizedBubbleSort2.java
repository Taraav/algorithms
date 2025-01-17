package org.pg4200.ex03;

import java.util.Comparator;

public class OptimizedBubbleSort2 {
    public <T> int sort(T[] array, Comparator<T> comparator, boolean optimized){

        boolean swapped = true;
        int sum = 0;

        if(array == null){
            return 0;
        }

        if(!optimized) {
            while (swapped) {

                swapped = false;

                for (int i = 0; i < array.length - 1; i++) {
                    int j = i + 1;
                    sum++;

                    if (comparator.compare(array[i], array[j]) > 0) {

                            T temp = array[i];
                            array[i] = array[j];
                            array[j] = temp;

                            swapped = true;
                    }
                }
            }
        }

        return sum;
    }
}
