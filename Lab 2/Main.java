package com.jets.lib;

public class Main {
    public static void main(String args[]) {
        System.out.println();

//        MinMax minMax = new MinMax();
//        minMax.printMin();
//        minMax.printMax();

        BinarySearch binSearch = new BinarySearch();
        binSearch.printArray();
        binSearch.sort();
        binSearch.printArray();
        binSearch.search(5, 0 ,999);
    }
}