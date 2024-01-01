package com.jets.lib;

public class MinMax {
    final int SIZE = 1000;
    int[] arr = new int[SIZE];
    int min, max;
    long time, timeStart, timeFinish;

    MinMax() {
        for (int i = 0; i < SIZE; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        min = max = arr[0];
    }

    void printMin() {
        timeStart = System.nanoTime();
        for (int i = 0; i < SIZE; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        timeFinish = System.nanoTime();
        time = timeFinish - timeStart;
        System.out.println("Minimum number is: " + min);
        System.out.println("Time taken: " + time + "ns\n");
    }

    void printMax() {
        timeStart = System.nanoTime();
        for (int i = 0; i < SIZE; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        timeFinish = System.nanoTime();
        time = timeFinish - timeStart;
        System.out.println("Maximum number is: " + max);
        System.out.println("Time taken: " + time + "ns\n");
    }
}
