package com.methods;

public class Shadowing {
    static int x = 0;

    public static void main(String[] args) {
        System.out.println(x); // prints 0
        int x = 10; // new x initialized
        System.out.println(x); // prints 10
        fun(); // calls for x but can only access the variable at the higher scope // this is known as shadowing
    }

    public static void fun() {
        System.out.println(x);
    }
}
