package codingtest;

import java.util.Scanner;

public class T2588 { //곱셈
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();

        int A = a*(b%10);
        int B = a*((b%100)/10);
        int C = a*(b/100);
        int D = a*b;

        System.out.println(A);
        System.out.println(B);
        System.out.println(C);
        System.out.println(D);
    }
}

