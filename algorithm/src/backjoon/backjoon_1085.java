package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class backjoon_1085 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String input = br.readLine();
		
		StringTokenizer st = new StringTokenizer(input);
		int x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());
		int w = Integer.parseInt(st.nextToken());
		int h = Integer.parseInt(st.nextToken());
		
		int min = x;
		int[] list = {x, y, w-x, h-y};
		// x, y, w-x, h-y 비교해서 최소값 출력하기
		Arrays.sort(list);
//		for(int i = 0; i < list.length; i++) {
//			if(min > y) {
//				min = y;
//			} else if(min > w-x) {
//				min = (w-x);
//			} else if(min > h-y) {
//				min = (h-y);
//			}
//		}
		System.out.println(list[0]);
	
	}

}
