package backjoon;

import java.util.Scanner;

public class backjoon_2908 {

	public static void main(String[] args) {
		// 스캐너로 두 수를 문자열로 입력받는다.
		Scanner sc = new Scanner(System.in);
		String A = sc.next();
		String B = sc.next();
		
		StringBuffer sb1  = new StringBuffer(A);
		String reverseA = sb1.reverse().toString();
		StringBuffer sb2 = new StringBuffer(B);
		String reverseB = sb2.reverse().toString();
		
		if (Integer.parseInt(reverseA) >= Integer.parseInt(reverseB)) {
			System.out.println(reverseA);
		} else {
			System.out.println(reverseB);
		}
		
		
		// 조립한 숫자를 int로 바꾸고 크기를 비교하여 큰 수를 출력한다.

	}

}
