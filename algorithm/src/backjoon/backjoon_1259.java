package backjoon;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class backjoon_1259 {

	public static void main(String[] args) throws IOException {

		// 팰린드롬수이면 yes, 아니면 no 출력하기

		// 여러 줄 입력을 받는다
		Scanner sc = new Scanner(System.in);
		while(true) {
			String A = sc.nextLine();
			if(A.equals("0")) break;
			
			List<String> list = new ArrayList<>();
			Boolean felindrom = true;
			// substring으로 쪼개서 Arraylist에 넣고
			for(int i = 0; i < A.length(); i++) {
				 list.add(A.substring(i, i+1));
			}
			
			// for문 돌리면서 대칭인 숫자가 서로 일치하는지 확인하기
			for(int i = 0; i < list.size(); i++) {
				if(list.get(i).equals(list.get(list.size()-i-1))) {
					felindrom = true;
				} else {
					felindrom = false;
					break;
				}
			}
			
			if(felindrom) {
				System.out.println("yes");
			} else  {
				System.out.println("no");
			}
			
		}
		sc.close();
	}

}
