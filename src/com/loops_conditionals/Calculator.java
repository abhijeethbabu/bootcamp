package com.loops_conditionals;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        simpleCalc();
    }

    static void simpleCalc () {
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.print("Enter the operator: ");
            char op = in.next().trim().charAt(0);
            if (op == '+' || op == '-' || op == '*' || op =='/' || op == '%') {
                System.out.println("Enter the numbers n1 and n2");
                int n1 = in.nextInt();
                int n2 = in.nextInt();
                int n3 = 0;
                if (op == '+') n3 = n1 + n2;
                if (op == '-') n3 = n1 - n2;
                if (op == '*') n3 = n1 * n2;
                if (op == '/') n3 = n1 / n2;
                if (op == '%') n3 = n1 % n2;

                System.out.println("n1 " + op + " n2 = " + n3);
            } else if (op == 'x' || op == 'X') break;
            else System.out.println("Invalid operator");
        }
    }
}
