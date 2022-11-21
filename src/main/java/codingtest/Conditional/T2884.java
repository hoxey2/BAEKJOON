package codingtest.Conditional;

import java.util.Scanner;

public class T2884 { //알람시계
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int M = sc.nextInt();
        if (H > 0 && M <= 44) {
            System.out.println(H - 1);
            System.out.println(15 + M);
        } else if (H > 0 && M >= 45) {
            System.out.println(H);
            System.out.println(M - 45);
        } else if (H < 0 && M <= 44) {
            System.out.println(23 + H);
            System.out.println(15 + M);
        } else if (H < 0 && M >= 45) {
            System.out.println(24 + H);
            System.out.println(M - 45);
        } else if (H == 0 && M <= 44) {
            System.out.println(23 + H);
            System.out.println(15 + M);
        } else if (H == 0 && M >= 45) {
            System.out.println(H);
            System.out.println(M - 45);
        }
    }
}
