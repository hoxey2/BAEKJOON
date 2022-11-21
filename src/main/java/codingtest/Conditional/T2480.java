package codingtest.Conditional;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class T2480 { //주사위 세개
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        List<Integer> list = Arrays.asList(A, B, C);

        if ((A >= 1 && A <= 6) && (B >= 1 && B <= 6) && (C >= 1 && C <= 6)) {
            if (A == B && B == C && A == C) {
                System.out.println(10000 + A * 1000);
            } else if (A == B || A == C) {
                System.out.println(1000 + A * 100);
            } else if (B == C) {
                System.out.println(1000 + B * 100);
            } else if (A > B && A > C) {
                System.out.println(A * 100);
            } else if (B > A && B > C) {
                System.out.println(B * 100);
            } else if (C>A && C>B){
                System.out.println(C * 100);
            }
        }
    }
}
