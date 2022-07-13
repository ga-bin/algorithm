package backjoon;

import java.util.Scanner;

public class backjoon_2562 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] list = new int[9];
		
		int maxNum = 0;
		int maxNumIndex = 0;
		
		for(int i = 0; i < list.length; i++) {
			list[i] = Integer.parseInt(sc.nextLine());
			if(maxNum < list[i]) {
				maxNum = list[i];
				maxNumIndex = i+1;
			}
		}
		
		System.out.println(maxNum);
		System.out.println(maxNumIndex);
		
	}

}
