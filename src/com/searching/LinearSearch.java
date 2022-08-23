package com.searching;

public class LinearSearch {
    public static void main(String[] args) {

    }

    static int linearSearch(int[] arr, int a) {
        if (arr.length == 0) return -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == a) return i;
        }
        return -1;
    }
    static int linearSearch2 (int[] arr, int a) {
        // return the element
        if (arr.length == 0) return Integer.MAX_VALUE;
        for(int e: arr) {
            int target = 0;
            if (e == target) return e;
        }
        return Integer.MAX_VALUE;
    }
    

}
