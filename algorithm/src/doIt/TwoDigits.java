package doIt;

import java.util.Scanner;

public class TwoDigits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		
		System.out.println("2자리의 양수를 입력하세요");
		
		do {
			System.out.println("num값 : ");
			num = sc.nextInt();
		} while(num < 10 || num > 99);
		
		System.out.println("변수 num값은" + num + "이 되었습니다.");
	}

}
