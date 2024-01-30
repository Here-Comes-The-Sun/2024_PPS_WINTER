package edu.handong.pps.week_2_3;

/*
문제
수 124를 뒤집으면 421이 되고 이 두 수를 합하면 545가 된다. 124와 같이 원래 수와 뒤집은 수를 합한 수가 좌우 대칭이 되는지 테스트 하는 프로그램을 작성하시오.

입력
입력의 첫 줄에는 테스트 케이스의 개수 T가 주어진다. 각 테스트 케이스는 한 줄에 하나의 정수 N(10 ≤ N ≤ 100000)이 주어진다.

출력
각 테스트 케이스에 대해서 원래 수와 뒤집은 수를 합한 수가 좌우 대칭이 되면 YES를 아니면 NO를 한 줄에 하나씩 출력한다.
 */

import java.util.Scanner;

public class A108_지우형_21600699 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int itr = scanner.nextInt();
        int[] num = new int[itr];
        for(int i=0; i<itr;i++) num[i] = scanner.nextInt();
        for(int i=0; i<itr;i++) {
        	StringBuilder revese_str = new StringBuilder("");
        	String num_str = Integer.toString(num[i]);
        	for(int j=num_str.length()-1;j>=0;j--) {
        		revese_str.append(num_str.charAt(j));
        	}
        	int reverse_num = Integer.parseInt(revese_str.toString());
        	int sum = num[i]+reverse_num;
        	String sum_str = Integer.toString(sum);
        	boolean isPal = true;
        	if(sum_str.length()==1) {
        		isPal = true;
        	}
        	else {
        		for(int j=0; j<sum_str.length()/2;j++) {
        			if(sum_str.charAt(j)!=sum_str.charAt(sum_str.length()-1-j)) {
        				isPal = false;
        				break;
        			}
        			
        		}
        	}
        	if(isPal) {
        		System.out.println("YES");
        	}
        	else {
        		System.out.println("NO");
        	}
        }
        	
        
        
        scanner.close();
        

    }
    
}
