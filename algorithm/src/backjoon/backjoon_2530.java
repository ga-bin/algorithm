package backjoon;

import java.util.Scanner;

public class backjoon_2530 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// A 현재시간 시
		int A = Integer.parseInt(sc.next());
		// B 현재시간 분
		int B = Integer.parseInt(sc.next());
		// C 현재시간 초
		int C = Integer.parseInt(sc.next());
		// D 요리를 하는데 필요한 시간(초)
		int D = Integer.parseInt(sc.next());
		
		int hour, min, sec;
		
		min = D / 60;
		hour = min / 60;
		sec = D % 60;
		min = min % 60;
		
		A = A + hour;
		B = B + min;
		C = C + sec;
		
		if(C >= 60) {
			B += 1;
			C -= 60;
		}
		if(B >= 60) {
			A += 1;
			B -= 60;
		} 
		if(A >= 24) {
			A = A % 24;
		}
		
		System.out.println(A + " " + B + " " + C);
	}

}
