package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class backjoon_1264 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int vowel = 0;
		
		while(true) {
			vowel = 0;
			String sentence = br.readLine();
			if(sentence.equals("#")) break;
			
			String lowerSentence = sentence.toLowerCase();
			
			for(int i = 0; i < lowerSentence.length(); i++) {
				char n = lowerSentence.charAt(i);
				if(n =='a' || n == 'e' || n == 'i' || n == 'o' || n == 'u' ) {
					vowel++;
			}
			}
		
			System.out.println(vowel);
		}

	}

}
