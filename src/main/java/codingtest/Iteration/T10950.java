package codingtest.Iteration;

import java.util.Arrays;
import java.util.Scanner;

public class T10950 { //A+B-3
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        int A[] = new int[T];
        int B[] = new int[T];

        for (int i = 0; i < T; i++) {
            A[i] = sc.nextInt();
            B[i] = sc.nextInt();


        }
        for (int i = 0; i < T; i++) {
            System.out.println(A[i]+B[i]);
        }
    }
}
