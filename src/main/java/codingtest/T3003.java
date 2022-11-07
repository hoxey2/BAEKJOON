package codingtest;

import java.util.Scanner;

public class T3003 { //킹, 퀸, 룩, 비숍, 나이트, 폰
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int sumA = 1;
        int sumB = 1;
        int sumC = 2;
        int sumD = 2;
        int sumE = 2;
        int sumF = 8;
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();
        int f = sc.nextInt();
        System.out.println(sumA-a);
        System.out.println(sumB-b);
        System.out.println(sumC-c);
        System.out.println(sumD-d);
        System.out.println(sumE-e);
        System.out.println(sumF-f);
    }
}

