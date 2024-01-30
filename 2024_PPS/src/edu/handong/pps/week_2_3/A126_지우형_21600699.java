package edu.handong.pps.week_2_3;

/*
문제
어떤 양의 정수 X의 각 자리가 등차수열을 이룬다면, 그 수를 한수라고 한다. 
등차수열은 연속된 두 개의 수의 차이가 일정한 수열을 말한다. 
N이 주어졌을 때, 1보다 크거나 같고, N보다 작거나 같은 한수의 개수를 출력하는 프로그램을 작성하시오. 

입력
첫째 줄에 1,000보다 작거나 같은 자연수 N이 주어진다.

출력
첫째 줄에 1보다 크거나 같고, N보다 작거나 같은 한수의 개수를 출력한다.
 */

import java.util.Scanner;

public class A126_지우형_21600699 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int count = 0;
        for(int i=1;i<=N;i++) {
        	
        	String i_str = Integer.toString(i);
        	if(i_str.length()<3) {
        		count++;
        	}
        	else {
        		boolean isSameSub=true;
        		int sub = (int)i_str.charAt(0)-'0'-(int)i_str.charAt(1)-'0';
            	for(int j=0;j<i_str.length()-1;j++) {
            		if(((int)i_str.charAt(j)-'0'-(int)i_str.charAt(j+1)-'0')!=sub){
            			isSameSub = false;
            		}
            	}
            	if(isSameSub) count++;
        	}
        	
        }
        
        System.out.println(count);
        scanner.close();
        

    }
    
}
