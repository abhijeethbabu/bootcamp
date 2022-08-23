package com.arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExamples {
    public static void main(String[] args) {
//        ArrayList<Integer> list = new ArrayList<>(10);
//        for (int i = 0; i < 12; i++) {
//            list.add(i);
//        }
//        System.out.println(list);
//        System.out.println(list.contains(11));
//        System.out.println(list.contains(32));
//        System.out.println(list.get(2));
//        System.out.println(list.size());
        // Multidimensional arraylist
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            list.add(new ArrayList<>());
        }
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                list.get(i).add(sc.nextInt());
            }
        }
        System.out.println(list);
        int[] arr = {1, 5, 23, 51, -4};

    }

}
