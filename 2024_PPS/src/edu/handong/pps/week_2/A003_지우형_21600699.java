package edu.handong.pps.week_2;

import java.math.BigInteger;
import java.util.Scanner;

/*
문제 설명
문자열 s의 길이가 4 혹은 6이고, 숫자로만 구성돼있는지 확인해주는 함수, solution을 완성하세요. 예를 들어 s가 "a234"이면 False를 리턴하고 "1234"라면 True를 리턴하면 됩니다.

제한 사항
s는 길이 1 이상, 길이 8 이하인 문자열입니다.
s는 영문 알파벳 대소문자 또는 0부터 9까지 숫자로 이루어져 있습니다.
 */
public class A003_지우형_21600699 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] digits = {7,2,8,5,0,9,1,2,9,5,3,6,6,7,3,2,8,4,3,7,9,5,7,7,4,7,4,9,4,7,0,1,1,1,7,4,0,0,6};
        int[] result = plusOne(digits);
        for(int i=0; i<result.length;i++) {
        	System.out.println(result[i]);
    	}
        
        
        
        scanner.close();
        
    }

    
    public static int[] plusOne(int[] digits) {
    	BigInteger num = BigInteger.ZERO;
    	BigInteger soo = BigInteger.ONE;
    	for(int i = 0; i<digits.length-1; i++) {
    		soo = soo.multiply(BigInteger.TEN);
    	}
    	//System.out.println(soo);
    	for(int i = 0; i<digits.length; i++) {
    		if(digits[i]!=0) {
    			num = num.add(soo.multiply(BigInteger.valueOf(digits[i])));
    		}
    		
    		soo = soo.divide(BigInteger.TEN);
    	}
    	num = num.add(BigInteger.ONE);
    	String num_str = num.toString();
    	int[] answer = new int[num_str.length()];
    	for(int i=0; i<num_str.length();i++) {
    		answer[i] = num_str.charAt(i)-'0';
    	}
		return answer;
            
    }
    
}
