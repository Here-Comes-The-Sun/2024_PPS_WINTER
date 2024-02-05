package edu.handong.pps.week_3_2;

/*
문제
요세푸스 문제는 다음과 같다.

1번부터 N번까지 N명의 사람이 원을 이루면서 앉아있고, 양의 정수 K(≤ N)가 주어진다. 
이제 순서대로 K번째 사람을 제거한다. 한 사람이 제거되면 남은 사람들로 이루어진 원을 따라 이 과정을 계속해 나간다. 
이 과정은 N명의 사람이 모두 제거될 때까지 계속된다. 
원에서 사람들이 제거되는 순서를 (N, K)-요세푸스 순열이라고 한다. 예
를 들어 (7, 3)-요세푸스 순열은 <3, 6, 2, 7, 5, 1, 4>이다.


N과 K가 주어지면 (N, K)-요세푸스 순열을 구하는 프로그램을 작성하시오.

입력
첫째 줄에 N과 K가 빈 칸을 사이에 두고 순서대로 주어진다. (1 ≤ K ≤ N ≤ 1,000)

출력
예제와 같이 요세푸스 순열을 출력한다.

<1, 2, 3, 4, 5, 6, 7>
<1, 2, 4, 5, 6, 7> - 3
<1, 2, 4, 5, 7> - 6
<1, 4, 5, 7> - 2
<1, 4, 5> - 7
<1, 4> - 5
<4> - 1
 */


import java.util.Scanner;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class A069_지우형_21600699 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int K = scanner.nextInt();

        Node[] headNtail = buildCircularLinkedList(N);
        
        Node head = headNtail[0];
        Node prev = headNtail[1];

        StringBuilder sb = new StringBuilder("<");
        Node current = head;
        
        while (prev.next != prev) {
            // K-1번째 노드로 이동
            for (int i = 0; i < K - 1; i++) {
            	prev = current;
                current = current.next;
            }

            
            sb.append(current.data).append(", ");
            
            //현재 노드 제거, 노드 하나 이
            prev.next = current.next;
            current = current.next;
            

        }

        // 마지막 남은 노드를 출력
        sb.append(current.data).append(">");
        System.out.println(sb.toString());

        scanner.close();
    }

    private static Node[] buildCircularLinkedList(int N) {
        Node head = new Node(1);
        Node current = head;
        Node tail = null;
        
        for (int i = 2; i <= N; i++) {
            current.next = new Node(i);
            current = current.next;
        }

        // 마지막 노드를 처음 노드와 연결하여 원형으로 만듦
        tail = current;
        current.next = head;
        
        Node[] head_tail = {head, tail};
        return head_tail;
    }
}






