package edu.handong.pps.week_3_2;

/*
문제
"OOXXOXXOOO"와 같은 OX퀴즈의 결과가 있다. O는 문제를 맞은 것이고, X는 문제를 틀린 것이다. 문제를 맞은 경우 그 문제의 점수는 그 문제까지 연속된 O의 개수가 된다. 예를 들어, 10번 문제의 점수는 3이 된다.

"OOXXOXXOOO"의 점수는 1+2+0+0+1+0+0+1+2+3 = 10점이다.

OX퀴즈의 결과가 주어졌을 때, 점수를 구하는 프로그램을 작성하시오.

입력
첫째 줄에 테스트 케이스의 개수가 주어진다. 각 테스트 케이스는 한 줄로 이루어져 있고, 길이가 0보다 크고 80보다 작은 문자열이 주어진다. 문자열은 O와 X만으로 이루어져 있다.

출력
각 테스트 케이스마다 점수를 출력한다.

예제 입력 1 
5
OOXXOXXOOO
OOXXOOXXOO
OXOXOXOXOXOXOX
OOOOOOOOOO
OOOOXOOOOXOOOOX
예제 출력 1 
10
9
7
55
30
 */

import java.util.Scanner;

public class A052_지우형_21600699 {
    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);

        int testCases = scanner.nextInt();
        scanner.nextLine();
        int score[] = new int[testCases];
        for (int i = 0; i < testCases; i++) {
            String result = scanner.nextLine();
            score[i] = calculateScore(result);
            
        }
        for (int n : score) {
        	System.out.println(n);
        }
        scanner.close();
    }
    private static int calculateScore(String result) {
        int score = 0;
        int consecutiveO = 0;

        for (char ch : result.toCharArray()) {
            if (ch == 'O') {
                consecutiveO++;
                score += consecutiveO;
            } else {
                consecutiveO = 0;
            }
        }

        return score;
    }
}



