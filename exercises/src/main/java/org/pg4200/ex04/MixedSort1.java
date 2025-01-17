package org.pg4200.ex04;

import org.pg4200.les03.sort.MySort;

public class MixedSort1 implements MySort {

    @Override
    public <T extends Comparable<T>> void sort(T[] array) {
        if(array == null){
            return;
        }

        T[] buffer = (T[]) new Comparable[array.length];

        mergesort(0, array.length - 1, array, buffer);
    }

    private <T extends Comparable<T>> void mergesort(int low, int high, T[] array, T[] buffer){
        if(low >= high){
            return;
        }

        int middle = low + (high - low) / 2;

        mergesort(low, middle, array, buffer);
        mergesort(middle + 1, high, array, buffer);
        merge(low, middle, high, array, buffer);

    }

    private <T extends Comparable<T>> void merge(int low, int middle, int high, T[] array, T[] buffer){
        for(int i = low; i <= high; i++){
            buffer[i] = array[i];
        }

        int i = low;
        int j = middle + 1;


        for(int k = low; k <= high; k ++){
            if(i > middle){
                array[k] = buffer[j++];
            }else if(j > high){
                array[k] = buffer[i++];
            }else if(buffer[j].compareTo(buffer[i]) < 0){
                array[k] = buffer[j++];
            }else{
                array[k] = buffer[i++];
            }
        }

    }
}
