package com.searching;

public class TwoDArrayMaxMin {
    public static void main(String[] args) {

    }
    static int max2d (int[][] arr) {
        int max = arr[0][0];
        for(int[] a : arr) {
            for(int e: a) {
               max = Math.max(max, e);
            }
        }
        return max;
    }
}
