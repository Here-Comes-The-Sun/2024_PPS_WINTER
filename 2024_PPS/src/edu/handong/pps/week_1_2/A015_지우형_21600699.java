package edu.handong.pps.week_1_2;



/*
문제
다솜이는 은진이의 옆집에 새로 이사왔다. 다솜이는 자기 방 번호를 예쁜 플라스틱 숫자로 문에 붙이려고 한다.

다솜이의 옆집에서는 플라스틱 숫자를 한 세트로 판다. 한 세트에는 0번부터 9번까지 숫자가 하나씩 들어있다. 
다솜이의 방 번호가 주어졌을 때, 필요한 세트의 개수의 최솟값을 출력하시오. 
(6은 9를 뒤집어서 이용할 수 있고, 9는 6을 뒤집어서 이용할 수 있다.)

입력
첫째 줄에 다솜이의 방 번호 N이 주어진다. N은 1,000,000보다 작거나 같은 자연수이다.

출력
첫째 줄에 필요한 세트의 개수를 출력한다.
 */

import java.util.Scanner;

public class A015_지우형_21600699 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int money = scanner.nextInt();
        money = 1000-money;
        int result = 0;
        int result_500;
        int result_100;
        int result_50;
        int result_10;
        int result_5;
        int result_1;
        
        result_500=money/500;
        money -= 500*result_500;

        
        result_100=money/100;
        money -= 100*result_100;


        result_50=money/50;
        money -= 50*result_50;


        result_10=money/10;
        money -= 10*result_10;


        result_5=money/5;
        money -= 5*result_5;


        result_1=money/1;
        money -= 1*result_1;


        result = result_500+result_100+result_50+result_10+result_5+result_1;
        scanner.close();
        System.out.println(result);
    }

    
}
