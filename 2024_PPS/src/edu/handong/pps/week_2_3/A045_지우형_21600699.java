package edu.handong.pps.week_2_3;

/*
문제
알파벳 대소문자로 된 단어가 주어지면, 이 단어에서 가장 많이 사용된 알파벳이 무엇인지 알아내는 프로그램을 작성하시오. 단, 대문자와 소문자를 구분하지 않는다.

입력
첫째 줄에 알파벳 대소문자로 이루어진 단어가 주어진다. 주어지는 단어의 길이는 1,000,000을 넘지 않는다.

출력
첫째 줄에 이 단어에서 가장 많이 사용된 알파벳을 대문자로 출력한다. 단, 가장 많이 사용된 알파벳이 여러 개 존재하는 경우에는 ?를 출력한다.
 */

import java.util.Scanner;

public class A045_지우형_21600699 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        char[] alphabet = new char[26];
        int[] alphabet_int = new int[26];
        str = str.toLowerCase();
        int max=-1;
        int index = 0;
        
        for(int i=0;i<alphabet_int.length;i++) alphabet_int[i]=0;
        for(int i=0;i<alphabet_int.length;i++) alphabet[i]=(char) (i+97);
        for(int i=0;i<str.length();i++) {
        	for(int j=0;j<alphabet.length;j++) {
        		if(str.charAt(i)==alphabet[j]) {
        			alphabet_int[j]++;
        			
        		}
        	}
        }
        for(int i=0;i<alphabet_int.length;i++) {
        	if(alphabet_int[i]>=max) {
        		max=alphabet_int[i];
        		index = i;
        	}
        }
        int max_cnt=0;
        for(int i=0;i<alphabet_int.length;i++) {
        	if(alphabet_int[i] == max) {
        		max_cnt++;
        	}
        }
        if(max_cnt>1) {
        	System.out.println("?");
        }
        else {
        	System.out.println((char)(alphabet[index]-32));
        }
       
        scanner.close();
    }
}

