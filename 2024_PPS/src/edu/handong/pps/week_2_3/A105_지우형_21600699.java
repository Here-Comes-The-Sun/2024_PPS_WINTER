package edu.handong.pps.week_2_3;

/*
문제
무한히 큰 배열에 다음과 같이 분수들이 적혀있다.

1/1	1/2	1/3	1/4	1/5	…
2/1	2/2	2/3	2/4	…	…
3/1	3/2	3/3	…	…	…
4/1	4/2	…	…	…	…
5/1	…	…	…	…	…
…	…	…	…	…	…
이와 같이 나열된 분수들을 1/1 → 1/2 → 2/1 → 3/1 → 2/2 → … 과 같은 지그재그 순서로 차례대로 1번, 2번, 3번, 4번, 5번, … 분수라고 하자.

X가 주어졌을 때, X번째 분수를 구하는 프로그램을 작성하시오.

입력
첫째 줄에 X(1 ≤ X ≤ 10,000,000)가 주어진다.

출력
첫째 줄에 분수를 출력한다.
1->2->3->4->5->6->
1->3->6->10->15->21->28
 */

import java.util.Scanner;

public class A105_지우형_21600699 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int i_sum=0;
        int i=1;
        int boonmo;
        int boonja;
        while(true) {
        	if(i_sum+i<num) i_sum+=i;
        	else break;
        	i++;
        }
        //System.out.println("i= "+i);
        //System.out.println("i_sum= "+i_sum);
        int numMinusSum = num - i_sum;
        //System.out.println("numMinusSum= "+numMinusSum);
        if(i%2==0) {//내려
        	boonmo = i - (numMinusSum-1);
        	boonja = numMinusSum;
        }
        else {//올라
        	boonmo = numMinusSum;
        	boonja = i - (numMinusSum-1);
        }

        	
        
        scanner.close();
        System.out.println(boonja+"/"+boonmo);

    }
    
}
