package backjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class backjoon_8958 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());
		int sum = 0;
		
		for(int i = 0; i < n; i++) {
			sum = 0;
			String ox = br.readLine();
			
			// 문자열을 지정한 구분자로 쪼개주는 것
			StringTokenizer st = new StringTokenizer(ox, "X");
			
			while(st.hasMoreTokens()) {
				String s = st.nextToken();
				for(int j = 0; j < s.length(); j++) {
					sum += (j+1);
				}
			}
			System.out.println(sum);
		}

		                               
		
	}
}
