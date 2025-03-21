package datastructure;

import javax.crypto.Mac;
import java.util.Scanner;

public class BOJ1546 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int max = 0;
        int sum = 0;

        for (int i = 0; i<N; i++) {
            int temp = sc.nextInt();
            if (temp > max) max = temp;

            sum += temp;
        }

        System.out.println(sum * 100.0 / max / N);
    }
}
