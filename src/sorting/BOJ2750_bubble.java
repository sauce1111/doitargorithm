package sorting;

import java.util.Scanner;

public class BOJ2750_bubble {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int totalNum = sc.nextInt();
        int [] sortArr = new int[totalNum];

        for(int i=0; i<totalNum; i++) {
            sortArr[i] = sc.nextInt();
        }

        for(int i=0; i<totalNum-1; i++) {
            for(int j=0; j<totalNum-1-i; j++) { // j < totalNum - 1 - i; 1차 for 문이 한번 돌수록 정렬 된 데이터가 쌓이므로 1씩 줄여준다
                if(sortArr[j] > sortArr[j+1]) {
                    // swap
                    int temp = sortArr[j];
                    sortArr[j] = sortArr[j+1];
                    sortArr[j+1] = temp;
                }
            }
        }

        for(int i=0; i<totalNum; i++) {
            System.out.println(sortArr[i]);
        }
    }
}
