package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class backjoon_2231_2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// target을 입력받는다.
		String s = br.readLine();
		int n = Integer.parseInt(s);
		
		List<ArrayList<Integer>> list = new ArrayList<>();
		for(int i = 0; i <= 1000000; i++) {
			list.add(new ArrayList<Integer>());
		}
		
		for(int i = 1; i < 1000000; i++) {
			int sum = i;
			int a = i;
			// 분해합 계산을 한다.
			while (a != 0) {
				sum += a % 10;
				a /= 10;
			}
			
			if(sum <= 1000000) {
				// 특정 수 i의 분해합(sum)의 arrayList에 특정 수 i를 넣는 방식
				list.get(sum).add(i);
			}
		
		}
		if (list.get(n).size() == 0) {
			System.out.println(0);
		} else {
			System.out.println(list.get(n));
		}
	}

}
