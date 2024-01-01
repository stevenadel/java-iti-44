package com.jets.lib;

import java.util.Arrays;

public class BinarySearch {
    final int SIZE = 1000;
    int[] arr = new int[SIZE];

    BinarySearch() {
        for (int i = 0; i < SIZE; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
    }

    void printArray() {
        for (int n : arr) {
            System.out.print(n + " ");
        }
        System.out.println();
    }

    void sort() {
        Arrays.sort(arr);
    }

    void search(int queryNumber, int start, int end) {
        int middle = (start + end) / 2;

        if (arr[middle] == queryNumber) {
            System.out.println("Number " + queryNumber + " is present in array.");
        } else if (start > end) {
            System.out.println("Number not in array!");
        } else if (arr[middle] > queryNumber) {
            search(queryNumber, start, middle -1);
        } else if (arr[middle] < queryNumber) {
            search(queryNumber, middle + 1, end);
        }
    }
}
