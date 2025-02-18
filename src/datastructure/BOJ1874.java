package datastructure;

import java.util.Scanner;
import java.util.Stack;

public class BOJ1974 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for (int i=0; i<N; i++) {
            arr[i] = sc.nextInt();
        }

        Stack<Integer> stack = new Stack<>();
        int num = 1;
        StringBuffer bf = new StringBuffer();
        boolean result = true;
        for (int i=0; i<arr.length; i++) {
            int inputNum = arr[i];

            if (inputNum >= num) {
                while (inputNum >= num) {
                    stack.push(num++);
                    bf.append("+\n");
                }
                stack.pop();
                bf.append("-\n");
            } else {
                int n = stack.pop();
                if (n > inputNum) {
                    System.out.println("NO");
                    result = false;
                    break;
                } else {
                    bf.append("-\n");
                }
            }
        }

        if (result) {
            System.out.println(bf.toString());
        }
    }
}
