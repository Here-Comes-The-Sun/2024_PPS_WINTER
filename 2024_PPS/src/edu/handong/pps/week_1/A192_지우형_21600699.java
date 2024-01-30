package edu.handong.pps.week_1;



/*
문제
n이 주어졌을 때, 1부터 n까지 합을 구하는 프로그램을 작성하시오.

입력
첫째 줄에 n (1 ≤ n ≤ 10,000)이 주어진다.

출력
1부터 n까지 합을 출력한다.
 */

import java.util.Scanner;

public class A192_지우형_21600699 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int iter = scanner.nextInt();
        scanner.nextLine(); 
        int sum = 0;

        for (int i = 0; i <= iter; i++) {
            sum+=i;
            
            
        }

        scanner.close();
        System.out.println(sum);
    }

    
}
