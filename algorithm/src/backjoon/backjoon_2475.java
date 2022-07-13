package backjoon;

import java.util.Scanner;

public class backjoon_2475 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int list[] = new int[5];
		int checkNum = 0;
		for(int i = 0; i < 5; i++) {
			list[i] = Integer.parseInt(sc.next());
			checkNum += (list[i] * list[i]);
		}
		
		System.out.println(checkNum % 10);
		
	}

}
