package backjoon;

import java.util.Scanner;

public class backjoon_11720 {

	public static void main(String[] args) {
		// 스캐너를 이용해 문자열을 입력받는다.
		Scanner sc = new Scanner(System.in);
		int numsLength = Integer.parseInt(sc.nextLine());
		String nums = sc.nextLine();
		int sum = 0;
		// for문을 돌면서 nums를 substring으로쪼갠 후
		// int로 바꾸고 그 값을 더하도록 한다.
		for(int i = 0; i < nums.length(); i++) {
			int num = Integer.parseInt(nums.substring(i, i+1));
			sum += num;
		}
		System.out.println(sum);
		
	}

}
