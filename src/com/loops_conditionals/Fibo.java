package com.loops_conditionals;

public class Fibo {
    public static void main(String[] args) {
        System.out.println(fibo(7 ));
    }

    static int fibo(int n) {
        int fn_1 = 0;
        int fn = 1;
        int r = 2;
        while (r <= n) {
            int t = fn;
            fn = fn + fn_1;
            fn_1 = t;
            r++;
        }
        return fn;
    }
}
