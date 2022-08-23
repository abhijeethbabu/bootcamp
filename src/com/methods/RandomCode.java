package com.methods;

import java.util.Arrays;

public class RandomCode {
    int x = 10;
    public static void main(String[] args) {
//        String s = myGreet();
        // values initialized in a block cannot be used outside it?
//        {
//            int c = 10; this variable cannot be accessed outside this blocl
        //      you can initialize it outside the block and manipulate it within the block

//        }
//        System.out.println(c);
        int[][] a = {{1,2,3}, {3,4,5}, {6,7,8}};
        for(int[] arr : a) {
            System.out.println(Arrays.toString(arr));
        }

    }


    private static String myGreet() {
        return "Hello";
    }
}
