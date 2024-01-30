package edu.handong.pps.week_1;



/*
 문제 설명
array의 각 element 중 divisor로 나누어 떨어지는 값을 오름차순으로 정렬한 배열을 반환하는 함수, solution을 작성해주세요.
divisor로 나누어 떨어지는 element가 하나도 없다면 배열에 -1을 담아 반환하세요.

제한사항
arr은 자연수를 담은 배열입니다.
정수 i, j에 대해 i ≠ j 이면 arr[i] ≠ arr[j] 입니다.
divisor는 자연수입니다.
array는 길이 1 이상인 배열입니다.
 */
public class A004_지우형_21600699 {
    public static void main(String[] args) {
        // Example usage
        int[] arr = {5, 9, 7, 10};
        int divisor = 5;

        
        int[] result = solution(arr, divisor);
        for (int num : result) {
            System.out.print(num + " ");
        }
    }

    public static int[] solution(int[] arr, int divisor) {
    	int[] temp = new int[arr.length];
    	int max = -1;
  
    	int count = 0;
    	for(int i = 0;i<arr.length;i++) {
    		if(arr[i]%divisor==0) {
    			temp[count] = arr[i];
    			count++;
    		}
    	}
    	int[] answer;
    	if(count==0) {
    		answer = new int[1];
    		answer[0] = -1;
    		return answer;
    	}
    	else {
    		answer = new int[count];
    	}
    	while(true) {
    		max = -1;
    		for(int i = 0; i<temp.length; i++) {
        		if(temp[i]>max&&temp[i]!=-1) {
        			max = temp[i];
        		}	
        	}
    		answer[count-1] = max;
    		for(int i = 0; i<temp.length; i++) {
    			if(temp[i]==max) {
    				temp[i]=-1;
    			}
    		}
    		count--;
    		if(count==0) {
    			break;
    		}
    	}
    	

        return answer;
    }
}
