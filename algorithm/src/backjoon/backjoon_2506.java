package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class backjoon_2506 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		String scoreResult = br.readLine();
		int score = 1;
		int sumScore = 0;
		
		for(int i = 0; i < scoreResult.length(); i++) {
			if(scoreResult.charAt(i) == '0') {
				score = 1;
			} 
			if (scoreResult.charAt(i) == '1') {
				sumScore += score;
				score++;
			}
		}
		System.out.println(sumScore);
	}

}
