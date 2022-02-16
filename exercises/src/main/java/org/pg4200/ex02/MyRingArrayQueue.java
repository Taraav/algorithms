package org.pg4200.ex02;

import org.pg4200.les02.queue.MyQueue;

import java.util.Arrays;

public class MyRingArrayQueue<T> implements MyQueue<T> {

    protected Object[] data;

    private int head = -1;
    private int tail = -1;


    public MyRingArrayQueue(){
        this(10);
    }

    public MyRingArrayQueue(int capacity){

        data = new Object[capacity];
    }

    @Override
    public void enqueue(T value) {
        if(isEmpty()){
            head = 0;
            tail = 0;
        } else if(head <= tail){

            if(tail < data.length - 1) {
                tail++;
            } else {
                if(head != 0){
                    tail = 0;
                } else {

                    Object[] data2 = new Object[data.length * 2];

                    for(int i=0; i<data.length; i++){
                        data2[i] = data[i];
                    }
                    data = data2;
                    tail++;
                }
            }
        } else {

            if(tail < head - 1){
                tail++;
            } else {
                Object[] data3 = new Object[data.length * 2];

                int k = data.length - head;
                for(int i=0; i<k; i++){
                    data3[i] = data[head + i];
                }

                for(int i=0; i< (tail+1); i++){
                    data3[k + i] = data[i];
                }

                head = 0;
                tail = data.length;
                data = data3;
            }
        }

        data[tail] = value;
    }

    @Override
    public T dequeue() {
        if(isEmpty()){
            throw new RuntimeException();
        }

        T value = (T) data[head];

        if(size() == 1){
            //now it ll be empty
            head = -1;
            tail = -1;
        } else {
            /*
                Removing this line will still make all tests pass, as it
                is not a functional bug: it only impacts performance.
                It is done to avoid "memory leaks" in which we keep unused
                objects that cannot be garbage-collected.
             */
            data[head] = null;
            head++;
        }

        return value;
    }

    @Override
    public T peek() {
        if(isEmpty()){
            throw new RuntimeException();
        }

        return (T) data[head];
    }

    @Override
    public int size() {
        if(head < 0){
            return 0;
        }

        return (tail - head ) + 1;
    }

    @Override
    public boolean isEmpty() {
        return MyQueue.super.isEmpty();
    }
}
