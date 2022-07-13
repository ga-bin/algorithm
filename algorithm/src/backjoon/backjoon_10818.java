package backjoon;

import java.util.Scanner;

public class backjoon_10818 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = Integer.parseInt(sc.nextLine());
		int[] list = new int[N];
		
		for(int i = 0; i < list.length; i++) {
			list[i] = Integer.parseInt(sc.next());
		}
		
		int maxNum = list[0];
		int minNum = list[0];
		for(int i = 0; i < list.length; i++) {
			
			if(maxNum < list[i]) {
				maxNum = list[i];
			}
			if(minNum > list[i]) {
				minNum = list[i];
			}
		}
	
		System.out.print(minNum + " " + maxNum);
	}

}
