package edu.handong.pps.week_1_2;



/*
문제
컴퓨터를 제조하는 회사인 KOI 전자에서는 제조하는 컴퓨터마다 6자리의 고유번호를 매긴다. 
고유번호의 처음 5자리에는 00000부터 99999까지의 수 중 하나가 주어지며 6번째 자리에는 검증수가 들어간다. 검증수는 고유번호의 처음 5자리에 들어가는 5개의 숫자를 각각 제곱한 수의 합을 10으로 나눈 나머지이다.

예를 들어 고유번호의 처음 5자리의 숫자들이 04256이면, 각 숫자를 제곱한 수들의 합 0+16+4+25+36 = 81 을 10으로 나눈 나머지인 1이 검증수이다.

입력
첫째 줄에 고유번호의 처음 5자리의 숫자들이 빈칸을 사이에 두고 하나씩 주어진다.
 */

import java.util.Scanner;

import java.util.Scanner;

public class A017_지우형_21600699 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int result = 0;
        StringBuilder result_str = new StringBuilder();
        
        boolean[] set = new boolean[10];
        for(int i = 0;i<10;i++) {
    		set[i]=true;
    	}
        String num_str = Integer.toString(num);
        for(int i = 0;i<num_str.length();i++) {
    		result_str.append('a');
    	}
        StringBuilder stringBuilder = new StringBuilder(num_str);
        
        while(true) {

        	result++;
        	for(int i = 0;i<num_str.length();i++) {
        		for(int j = 0;j<10;j++) {
            		if(stringBuilder.charAt(i)==(char) j + '0') {
            			if(stringBuilder.charAt(i)=='6'&&set[6]==false) {
            				if(set[9]==true) {
            					stringBuilder.setCharAt(i, 'a');
            					set[9]=false;
            				}
            			}
            			if(stringBuilder.charAt(i)=='9'&&set[9]==false) {
            				if(set[6]==true) {
            					stringBuilder.setCharAt(i, 'a');
            					set[6]=false;
            				}
            			}
            			else if(set[j]==true) {
            				set[j]=false;
                			stringBuilder.setCharAt(i, 'a');
            			}
            		}
            	}
        	}

        	for(int i = 0;i<10;i++) {
        		set[i]=true;
        	}
        	
        	if(stringBuilder.toString().equals(result_str.toString())) {
        		break;
        	}
        	
        	else {
        		continue;
        	}
        }
       
        scanner.close();
        System.out.println(result);
    }

    
}
