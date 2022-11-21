package codingtest.Conditional;

import java.util.Scanner;

public class T2525 { //오븐 시계
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D;
        if ((A >= 0 && A <= 23) && (B >= 0 && B <= 59) && (C >= 0 && C <= 1000)) {
            B = B + C;
            if (B >= 60) {
                D = B / 60;
                A = A + D;
                B = B % 60;
                A = A % 24;
                System.out.println(A);
                System.out.println(B);
            } else if (B<60) {
                System.out.println(A);
                System.out.println(B);
            }
        }
    }
}

