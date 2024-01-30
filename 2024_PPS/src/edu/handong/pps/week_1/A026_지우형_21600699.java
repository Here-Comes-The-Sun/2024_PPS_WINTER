package edu.handong.pps.week_1;

import java.util.Scanner;

/*
문제 설명
양의 정수 x가 하샤드 수이려면 x의 자릿수의 합으로 x가 나누어져야 합니다. 예를 들어 18의 자릿수 합은 1+8=9이고, 18은 9로 나누어 떨어지므로 18은 하샤드 수입니다. 자연수 x를 입력받아 x가 하샤드 수인지 아닌지 검사하는 함수, solution을 완성해주세요.

제한 조건
x는 1 이상, 10000 이하인 정수입니다.
입출력 예
x	return
10	true
12	true
11	false
13	false
 */
public class A026_지우형_21600699 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int iter = scanner.nextInt();
        
        boolean result = solution(iter);
        System.out.println(result);
        scanner.close();
        
    }

    public static boolean solution(int x) {
        boolean answer = false;
        String num_str = Integer.toString(x);
        int sum = 0;
        for(int i = 0; i<num_str.length();i++) {
        	sum+=Character.getNumericValue(num_str.charAt(i));
        }
        if(x%sum==0) {
        	answer =true;
        }
        return answer;
    }
}
