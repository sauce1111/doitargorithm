package sorting;

import java.util.Scanner;

public class BOJ1427_selection {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String strNum = sc.nextLine();
        int[] arr = new int[strNum.length()];

        for(int i=0; i<strNum.length(); i++) {
            arr[i] = Integer.parseInt(strNum.substring(i, i+1));
        }

        // 선택정렬
        for(int i=0; i<strNum.length(); i++) {
            int max = i;
            for (int j=i+1; j<strNum.length(); j++) {
                // 이번 탐색중인 범위 내 j index 의 값이 더 크면 i index 로 변경
                if(arr[j] > arr[max]) {
                    max = j;
                }
            }
            if (arr[i] < arr[max]) {
                int temp = arr[i];
                arr[i] = arr[max];
                arr[max] = temp;
            }
        }

        for (int i=0; i<strNum.length(); i++) {
            System.out.print(arr[i]);
        }
    }
}
