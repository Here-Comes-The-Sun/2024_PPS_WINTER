package edu.handong.pps.week_3_2;

/*
문제
79를 영어로 읽되 숫자 단위로 하나씩 읽는다면 "seven nine"이 된다. 80은 마찬가지로 "eight zero"라고 읽는다. 79는 80보다 작지만, 영어로 숫자 하나씩 읽는다면 "eight zero"가 "seven nine"보다 사전순으로 먼저 온다.

문제는 정수 M, N(1 ≤ M ≤ N ≤ 99)이 주어지면 M 이상 N 이하의 정수를 숫자 하나씩 읽었을 때를 기준으로 사전순으로 정렬하여 출력하는 것이다.

입력
첫째 줄에 M과 N이 주어진다.

출력
M 이상 N 이하의 정수를 문제 조건에 맞게 정렬하여 한 줄에 10개씩 출력한다.

예제 입력 1 
8 28
예제 출력 1 
8 9 18 15 14 19 11 17 16 13
12 10 28 25 24 21 27 26 23 22
20
 */


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class A086_지우형_21600699 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 입력 받기
        int m = scanner.nextInt();
        int n = scanner.nextInt();

        // 숫자를 알파벳 순으로 정렬하여 리스트에 추가
        List<Integer> numbers = new ArrayList<>();
        for (int i = m; i <= n; i++) {
            numbers.add(i);
        }

        // 알파벳 순으로 정렬
        Collections.sort(numbers, new AlphabeticalComparator());

        // 10개씩 출력
        int count = 0;
        for (int number : numbers) {
            System.out.print(number + " ");
            count++;
            if (count == 10) {
                System.out.println();
                count = 0;
            }
        }

        scanner.close();
    }

    // 알파벳 순으로 정렬하기 위한 Comparator 클래스
    static class AlphabeticalComparator implements Comparator<Integer> {
        private final String[] digitWords = {
                "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"
        };

        @Override
        public int compare(Integer num1, Integer num2) {
            String word1 = convertToWord(num1);
            String word2 = convertToWord(num2);
            return word1.compareTo(word2);
        }

        private String convertToWord(int num) {
            StringBuilder result = new StringBuilder();
            while (num > 0) {
                int digit = num % 10;
                result.insert(0, digitWords[digit] + " ");
                num /= 10;
            }
            return result.toString().trim();
        }
    }
}



















