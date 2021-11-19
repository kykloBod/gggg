package com.company;

public class Main {

    public static void main(String[] args) {
        int a = 1500;
        int b = 2800;
        int c = ((b - a) / 10) * ((b - a) / 10) % 20;
        System.out.printf("a=%d(10)=%x(16)=%o(8)\n" + Integer.toBinaryString(a) + ("(2)"), a, a, a);
        System.out.printf("b=%d(10)=%x(16)=%o(8)\n" + Integer.toBinaryString(b) + ("(2)"), b, b, b);
        System.out.printf("c=%d(10)=%x(16)=%o(8)\n" + Integer.toBinaryString(c) + ("(2)"), c, c, c);
        System.out.println(a * (-1));
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);
        System.out.println(++a);
        System.out.println(--b);

    }
}
