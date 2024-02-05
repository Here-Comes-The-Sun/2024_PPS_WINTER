package edu.handong.pps.week_3_2;

/*
문제
2차원 평면 위의 점 N개가 주어진다. 좌표를 x좌표가 증가하는 순으로, x좌표가 같으면 y좌표가 증가하는 순서로 정렬한 다음 출력하는 프로그램을 작성하시오.

입력
첫째 줄에 점의 개수 N (1 ≤ N ≤ 100,000)이 주어진다. 둘째 줄부터 N개의 줄에는 i번점의 위치 xi와 yi가 주어진다. 
(-100,000 ≤ xi, yi ≤ 100,000) 좌표는 항상 정수이고, 위치가 같은 두 점은 없다.

출력
첫째 줄부터 N개의 줄에 점을 정렬한 결과를 출력한다.

예제 입력 1 
5
3 4
1 1
1 -1
2 2
3 3
예제 출력 1 
1 -1
1 1
2 2
3 3
3 4
 */

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class Point {
    int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class A065_지우형_21600699 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        Point[] points = new Point[N];

        for (int i = 0; i < N; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            points[i] = new Point(x, y);
        }

        // x 좌표로 정렬 후, x 좌표가 같을 경우 y 좌표로 정렬
        Arrays.sort(points, Comparator.comparing((Point p) -> p.x).thenComparing(p -> p.y));

        for (Point point : points) {
            System.out.println(point.x + " " + point.y);
        }

        scanner.close();
    }
}



