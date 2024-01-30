package edu.handong.pps.week_1;



/*
 문제
두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.

입력
첫째 줄에 A와 B가 주어진다. (0 < A,B < 10^10000)

출력
첫째 줄에 A+B를 출력한다.
 */
import java.util.Scanner;
import java.math.BigInteger;
public class A007_지우형_21600699 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		BigInteger A = scanner.nextBigInteger();
		BigInteger B = scanner.nextBigInteger();
		BigInteger sum = A.add(B);
		scanner.close();
		System.out.println(sum);
	}
}
