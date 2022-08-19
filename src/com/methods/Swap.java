package com.methods;

public class Swap  {
    public static void main(String[] args) {
        int a[] = new int[] {1, 2};
        System.out.println(a[0]);
        System.out.println(a[1]);
        swap(a, 0, 1);
        System.out.println(a[0]);
        System.out.println(a[1]);
    }
    static void swap (int[] a, int i, int j) {
        int t = a[i];
        a[i] = a[j];
        a[j] = t;
    }
    static void swapBitwise (int a, int b) {
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
    }
}
