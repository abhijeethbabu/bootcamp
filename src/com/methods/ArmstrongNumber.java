package com.methods;

import java.math.BigInteger;

public class ArmstrongNumber {
    public static void main(String[] args) {
        System.out.println(isArmstrong(153));
    }

    static boolean isArmstrong (int n) {
        /*
         Armstrong numbers are numbers which follow the below condition
         153 == 1 ^ 3 + 5 ^ 3 + 3 ^ 3 == 1 + 125 + 27
         */
        int nc = n;
        int sum = 0;
        while (nc > 0) {
            int rem = nc % 10;
            sum += rem * rem * rem;
            nc /= 10;
        }
        return n == sum;
    }
}
