package com.switchwithnestedcase;

public class SwitchExamples {
    public static void main(String[] args) {
        String s = "apple";
        switch (s) {
            case "apple" -> System.out.println("Apple");
            case "orange" -> System.out.println("Orange");
            default -> System.out.println("Fruits");
        }

        int day = 1;
        switch (day) {
            case 1, 2, 3, 4, 5 -> System.out.println("Weekday");
            case 6, 7 -> System.out.println("Weekend");
        }
    }
}
