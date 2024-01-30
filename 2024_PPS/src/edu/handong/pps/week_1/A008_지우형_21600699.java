package edu.handong.pps.week_1;



/*
문제
대학생 새내기들의 90%는 자신이 반에서 평균은 넘는다고 생각한다. 당신은 그들에게 슬픈 진실을 알려줘야 한다.

입력
첫째 줄에는 테스트 케이스의 개수 C가 주어진다.

둘째 줄부터 각 테스트 케이스마다 학생의 수 N(1 ≤ N ≤ 1000, N은 정수)이 첫 수로 주어지고, 이어서 N명의 점수가 주어진다. 점수는 0보다 크거나 같고, 100보다 작거나 같은 정수이다.

출력
각 케이스마다 한 줄씩 평균을 넘는 학생들의 비율을 반올림하여 소수점 셋째 자리까지 출력한다. 정답과 출력값의 절대/상대 오차는 10-3이하이면 정답이다.
 */
import java.util.Scanner;
public class A008_지우형_21600699 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int iterations;
		iterations = scanner.nextInt();
		
		double[] above_avg = new double[iterations]; 
		for(int i = 0 ; i<iterations;i++) {
			int inner_iter= scanner.nextInt();
			
			int[] scores = new int[inner_iter];
			int sum = 0;
			int above_avg_count = 0;
			for(int j = 0; j<inner_iter;j++) {
				scores[j]=scanner.nextInt();
				sum+=scores[j];
			}
			double avg = sum/inner_iter*1.0;

			for(int j = 0; j<inner_iter;j++) {
				if(scores[j]>avg) {
					above_avg_count++;
				}
			}
			above_avg[i] =(above_avg_count*1.0/inner_iter*100.0);
			
		}
		
		for(int i = 0 ; i<iterations;i++) {
			System.out.println(String.format("%.3f", above_avg[i])+"%");
		}
		
		scanner.close();
		
		
	}
	
}
