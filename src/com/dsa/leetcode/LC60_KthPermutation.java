package com.dsa.leetcode;

import java.util.ArrayList;


public class LC60_KthPermutation {
    public static void main(String[] args) {
        System.out.println(kthPermutation(66,664));
    }


     static StringBuilder kthPermutation(int n, int k) {
        k = k - 1;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= n ; i++) {
            list.add(i);
        }
        StringBuilder s = new StringBuilder("");
        int[] fact = new int[n];
        fact[0] = 1;
        for (int i = 1; i < n; i++) {
            if (fact[i - 1] * i > k) break;
            fact[i] = i * fact[i - 1];
        }
         for (int i = 0; i < n; i++) {
             if (fact[i] == 0) fact[i] = Integer.MAX_VALUE;
         }
//        System.out.println(Arrays.toString(fact));
        while (n > 0) {
            s.append(list.get(k / fact[n - 1]));
            list.remove(k / fact[n - 1]);
            k %= fact[n - 1];
            n--;
        }
        return s;
    }

}
