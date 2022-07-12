package backjoon;

import java.util.Scanner;

public class backjoon_2980 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 신호등의 개수 N
		int N = Integer.parseInt(sc.nextLine());
		// 도로의 길이 L
		int L = Integer.parseInt(sc.nextLine());
		// 신호등의 위치 D
		int D = 0;
		// 빨간색이 지속되는 시간 R
		int R = 0;
		// 초록색이 지속되는 시간 G
		int G = 0;
		// 상근이가 도로 끝까지 이동하는데 걸리는 시간 저장할 변수 acrossTime
		int acrossTime = 0;
		// 상근이가 간 거리 저장할 변수 acrossSpace;
		int acrossSpace = 0;
		for (int i = 0; i < N; i++) {
			D = Integer.parseInt(sc.nextLine());
			R = Integer.parseInt(sc.nextLine());
			G = Integer.parseInt(sc.nextLine());
			
			// 만약 신호등이 없는 구간에서는 시간 1초씩 늘어날때마다 간 거리 1씩 늘어나도록
			acrossSpace++;
			
		}

		// 초록불 -> 1초에 1m씩 이동
		// 빨간불 멈추기
		// 1초에 1미터씩 이동해서 그 길이가 L이랑 같아지면 그 시간 출력

		// 신호등 개수만큼 초록불, 파란불 반복

		// 상근이가 도로의 끝까지 이동하는데 걸리는 시간 출력
		// 빨간불 시간 + 초록불시간
		// 도로의 길이 : L

	}

}
