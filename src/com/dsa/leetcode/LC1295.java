package com.dsa.leetcode;

public class LC1295 {
    // Find Numbers with Even Number of Digits
    public int findNumbers(int[] nums) {
        int c = 0;
        for (int a : nums) {
            if(isEven(a)) c++;
        }
        return c;
    }

    private boolean isEven (int n) {
        int count = 0;
        while (n > 0) {
            count++;
            n /= 10;
        }
        return count % 2 == 0;
    }

    private static int solutionOpt (int[] nums) {
        int c = 0;
        for(int a: nums) {
            if (Math.log10(a) + 1 % 2 == 0) c++;
        }
        return c;
    }

    public static void main(String[] args) {
        int[] nums = {12, 1, 13};
        System.out.println(solutionOpt(nums));
    }
}
