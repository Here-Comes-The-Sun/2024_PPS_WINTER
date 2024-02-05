package edu.handong.pps.week_3_2;

/*
문제
N개의 정수가 주어진다. 이때, N개의 정수를 오름차순으로 정렬하는 프로그램을 작성하시오. 같은 정수는 한 번만 출력한다.

입력
첫째 줄에 수의 개수 N (1 ≤ N ≤ 100,000)이 주어진다. 둘째에는 숫자가 주어진다. 이 수는 절댓값이 1,000보다 작거나 같은 정수이다.

출력
첫째 줄에 수를 오름차순으로 정렬한 결과를 출력한다. 이때, 같은 수는 한 번만 출력한다.

예제 입력 1 
10
1 4 2 3 1 4 2 3 1 2
예제 출력 1 
1 2 3 4
 */


import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class A083_지우형_21600699 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt(); // 수의 개수
        int[] numbers = new int[N];

        // 숫자 입력 받기
        for (int i = 0; i < N; i++) {
            numbers[i] = scanner.nextInt();
        }

        // 정렬 및 중복 제거
        Arrays.sort(numbers);
        Set<Integer> uniqueNumbers = new LinkedHashSet<>();
        for (int number : numbers) {
            uniqueNumbers.add(number);
        }

        // 정렬된 유일한 숫자 출력
        for (int uniqueNumber : uniqueNumbers) {
            System.out.print(uniqueNumber + " ");
        }

        scanner.close();
    }
}















