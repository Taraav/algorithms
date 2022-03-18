package org.pg4200.ex04;

import org.pg4200.les03.sort.MySort;

public class MixedSort implements MySort {
    int low;
    int high;

    @Override
    public <T extends Comparable<T>> void sort(T[] array) {
        int arrayLength = array.length;

        if(low >= high){
            return;
        }

        int midIndex = low + (high - low);
        T[] leftHalf = (T[])new Comparable[midIndex];
        T[] rightHalf = (T[]) new Comparable[arrayLength - midIndex];

        for(int i = 0; i < midIndex; i ++){
            leftHalf[i] = array[i];
        }

        for(int i = midIndex; i < arrayLength; i++){
            rightHalf[i - midIndex] = array[i];
        }

        sort(leftHalf);
        sort(rightHalf);
        mergeSort(low,array.length + 1, midIndex, array, leftHalf, rightHalf);

    }

    private <T extends Comparable<T>> void mergeSort(int low, int high, int midIndex, T[] array, T[] leftHalf, T[] rightHalf){
        if (array == null) {
            return;
        }

        int leftSize = leftHalf.length;
        int rightSize = rightHalf.length;

        int i = low;
        int j = midIndex;
        int k = 0;

        while(i < leftSize && j < rightSize){
            if(leftHalf[i].compareTo(rightHalf[j]) <= 0){
                array[k] = leftHalf[i];
                i++;
            }else{
                array[k] = rightHalf[j];
                j++;
            }
            k++;
        }

        while(i < leftSize){
            array[k] = leftHalf[i];
            i++;
            k++;
        }
        while(i < rightSize){
            array[k] = rightHalf[i];
            i++;
            k++;
        }
    }
}
