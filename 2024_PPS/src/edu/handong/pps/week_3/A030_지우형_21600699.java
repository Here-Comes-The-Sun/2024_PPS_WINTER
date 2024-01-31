package edu.handong.pps.week_3;

/*
문제
지은이가 건국한 나라인 유애나에 살고 있는 재현이는 너무 단순한 나머지 매일이 기분이 좋은 날, 기분이 싫은 날 두가지로 나누어진다. 
어느 날 지은이는 재현이에 대한 놀라운 사실을 발견했다! 재현이의 오늘의 기분이 내일의 기분에 영향을 준다는 것이었다. 
문득 지은이는 N일 뒤의 재현이의 기분이 어떻게 될지 궁금하였다. 
지은이를 위해 N일 뒤 재현이의 기분이 어떨지 알려주는 프로그램을 만들어보자.

입력
첫째 줄에 정수 N(1 ≤ N ≤ 100)과 현재 재현이의 기분(좋은 날 0, 싫은 날 1)이 주어진다.

둘째 줄에 차례대로 
재현이가 기분이 좋은 날의 다음 날도 기분이 좋은 날일 확률, 
다음 날은 기분이 싫은 날일 확률, 
기분이 싫은 날의 다음 날이 기분이 좋은 날일 확률, 
다음 날도 기분이 싫은 날일 확률이 주어진다. 
확률은 소수점 둘째자리까지 주어진다.

출력
N일 뒤의 재현이의 기분이 좋은 날일 확률과 싫은 날일 확률에 1,000을 곱해 소수점 첫째자리에서 반올림한 수를 차례대로 출력한다. 
절대 오차는 100까지 허용한다.

 */

import java.util.Scanner;

public class A030_지우형_21600699 {
    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
    	
        int dayAfter = scanner.nextInt();
        int feelingToday = scanner.nextInt();
        double goodGood, goodBad, badGood, badBad;
        
        goodGood = scanner.nextDouble();
        goodBad = scanner.nextDouble();
        
        badGood = scanner.nextDouble();
        badBad = scanner.nextDouble();
        
        double currGoodPob = (feelingToday == 0) ? 1.0 : 0.0;
        double currBadPob = (feelingToday == 1) ? 1.0 : 0.0;
        for(int i= 1; i<=dayAfter; i++) {
        	double newGoodPob = currGoodPob*goodGood + currBadPob*badGood;
        	double newBadPob = currBadPob*badBad + currGoodPob*goodBad;
        	
        	currGoodPob = newGoodPob;
        	currBadPob = newBadPob;
        }
        
        double goodResult = currGoodPob*1000;
        double badResult = currBadPob*1000;
        
        String gR = String.format("%.0f", goodResult);
        String bR = String.format("%.0f", badResult);
    	System.out.println(gR);
    	System.out.println(bR);
    	scanner.close();
    	
        
        
    }
}

