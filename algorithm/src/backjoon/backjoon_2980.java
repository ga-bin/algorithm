package backjoon;

import java.util.Scanner;

public class backjoon_2980 {
	static Scanner sc = new Scanner(System.in);
	// N : 신호등의 개수
	static int N = Integer.parseInt(sc.nextLine());
	// L : 도로의 길이
	static int L = Integer.parseInt(sc.nextLine());
	// D : 신호등의 위치
	static int D = 0;
	// R : 빨간색 지속시간
	static int R = 0;
	// G : 초록색 지속 시간
	static int G = 0;
	// acrossLength : 상근이가 간 거리 저장할 변수
	static int acrossLength = 0;
	// acrossTime : 상근이가 걸린 시간 저장할 변수
	static int acrossTime = 0;
	
	
	public static void main(String[] args) {
		// 신호등의 위치 
		// 빨간색 지속시간
		// 초록색 지속시간 입력받는다.
		D = Integer.parseInt(sc.nextLine());
		R = Integer.parseInt(sc.nextLine());
		G = Integer.parseInt(sc.nextLine());
		
		// 상근이가 1초에 1미터씩 달린다.
		acrossTime++;
		acrossLength++;
		
		// 신호등이 빨간불인지 초록불인지 계산한다.
		if(acrossTime%(R+G) > R) {
			
		}
		
		
	}
	
	// 신호등정보 입력받을 함수
	private static void inputLight() {
		D = Integer.parseInt(sc.nextLine());
		R = Integer.parseInt(sc.nextLine());
		G = Integer.parseInt(sc.nextLine());
	}
	
}
