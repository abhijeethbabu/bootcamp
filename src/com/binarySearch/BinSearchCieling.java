package com.binarySearch;

public class BinSearchCieling {
    public static void main(String[] args) {
        System.out.println(cieling(new int[] {1, 4, 6, 9, 12, 14}, 10));
    }

    static int cieling (int[] arr, int target) {
        int start = 0, end = arr.length - 1, mid = 0;
        // int p = arr[start] < arr[end] ? 1 : -1;
        // edge cases arr[0] > target and  
        while (start <= end) {
            mid = start + (end - start) / 2;
            if (arr[mid] >= target && arr[mid - 1] < target) return mid;
            else if (arr[mid] < target) start = mid + 1;
            else end = mid;
        }
        return -1;
    }
}
