package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class backjoon_2231 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner sc = new Scanner(System.in);
 
		int target = Integer.parseInt(sc.nextLine()); //  216
		int result = 0; // 분해합 계산을 저장할 정수		
		
		for (int i = 0; i < target; i++) {
			// 숫자 하나 분해합 계산할 때마다 초기화
			result = 0;
			// 1, 2, 3, 4, 5이런식으로 target전까지 result에 숫자가 들어온다.
			result += i;
			// 1, 2, 3, 4, 5, 이런식으로 들어오는 숫자들을 String으로 바꾼다
			String str = String.valueOf(i); 
			// for문을 돌리면서 분해합을 계산한다.
			for(int k = 0; k < str.length(); k++) {
				// str에서 한글자 한글자씩 charAt으로 떼서 그것을 숫자로 바꿔서 더한다.
				result += Character.getNumericValue(str.charAt(k));
			}
			if(result == target) {
				System.out.println(i);
				break;
			}
		}
		// 반복문 끝까지 돌아서 result가 target이랑 같은 것 없으면 "0"을 출력한다.
		if(result != target) {
			System.out.println("0");
		}
	}
	
}
