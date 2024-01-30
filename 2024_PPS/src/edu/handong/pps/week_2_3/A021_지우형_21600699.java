package edu.handong.pps.week_2_3;



/*
문제
선영이의 집에는 콘센트를 꽂을 수 있는 플러그가 하나밖에 없다. 
선영이는 많은 컴퓨터를 가지고 있는데, 컴퓨터의 전원 문제는 어떻게 해결하는 것일까?

하나의 플러그가 있고, N개의 멀티탭이 있다. 
각 멀티탭은 몇 개의 플러그로 이루어져 있다고 한다. 
최대 몇 대의 컴퓨터를 전원에 연결할 수 있을까?

입력
첫째 줄에 멀티탭의 개수 N이 주어진다. 
(1 ≤ N ≤ 500,000) 이어서 둘째 줄부터 N개의 줄에 걸쳐 각 멀티탭이 몇 개의 플러그를 꽂을 수 있도록 되어 있는지를 나타내는 자연수가 주어진다. 
이 자연수는 1,000을 넘지 않는다.

출력
첫째 줄에 최대로 전원에 연결될 수 있는 컴퓨터의 수를 출력한다.
 */

import java.util.Scanner;

public class A021_지우형_21600699 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum =0;
        int num = scanner.nextInt();
        for(int i = 0; i<num; i++) {
        	sum+= scanner.nextInt()-1;
        }
        sum+=1;
        	
        
        scanner.close();
        System.out.println(sum);

    }
    
}
