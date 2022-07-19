package backjoon;

import java.util.Scanner;

public class backjoon_2231_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// target을 입력받는다
		int target = Integer.parseInt(sc.nextLine());
		// 분해합을 계산할 변수를 만든다
		int result = 0;
		// for문을 돌리면서 숫자를 하나씩 하나씩 확인한다.
		for(int i = 0; i < target; i++) {
			// 숫자 하나씩 계산할 때 마다 result를 초기화한다.
			result = 0;
			// result에 1, 2, 3, 4, 5이런식으로 숫자를 차례대로 받는다.
			result += i;
			// 분해합을 계산한다.
			// 먼저 result(int)를 string으로 바꾼다.
			String str = String.valueOf(result);
			for(int k = 0; k < str.length(); k++) {
				// 문자열을 하나씩 잘라서 숫자로 바꾼다음에 그것을 result에 더한다.
				result += Character.getNumericValue(str.charAt(k));
			}
			if(result == target) {
				System.out.println(i);
			}
		}
		if(result != target) {
			System.out.println("0");
		}
	}

}
