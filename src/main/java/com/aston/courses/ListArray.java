package com.aston.courses;

import java.util.Arrays;

public class ListArray<T>{

    private static final int DEFAULT_CAPACITY = 10;
    private T[] listArray;
    private int size;

    @SuppressWarnings("unchecked")
    public ListArray() {
        listArray = (T[]) new Object[DEFAULT_CAPACITY];
    }

    public void add(T obj) {
        if (size == (listArray.length)) {
            resize();
        }
        listArray[size] = obj;
        size++;
    }

    public void addAll(ListArray<T> obj) {
        for (int i = 0; i < obj.size; i++) {
            this.add(obj.get(i));
        }
    }

    private void resize() {
        int newListArray = listArray.length * 2;
        listArray = Arrays.copyOf(listArray, newListArray);
    }

    public int size() {
        return size;
    }

    public void remove(int i) {
        if (i < 0 || i >= size) {
            throw  new IndexOutOfBoundsException("Index: " + i + "  Size: " + size);
        }
        for (int j = i; j < size - 1; j++) {
            listArray[j] = listArray[j + 1];
        }
        size--;
    }

    public T get(int i) {
        if (i < 0 || i >= size) {
            throw  new IndexOutOfBoundsException("Index: " + i + "  Size: " + size);
        }
        return listArray[i];
    }

    @SuppressWarnings("unchecked")
    public void bubbleSort(){
        boolean needIteration = true;
            while (needIteration) {
                needIteration = false;
            for (int j = 0; j < this.size - 1; j++) {
                if (((Comparable<T>) listArray[j]).compareTo(listArray[j + 1]) > 0) {
                    T temp = listArray[j];
                    listArray[j] = listArray[j + 1];
                    listArray[j + 1] = temp;
                    needIteration = true;
                }
            }
        }
    }
}