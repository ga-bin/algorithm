package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class backjoon_10809 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 첫째줄에 단어 s를 입력받기
		String S = br.readLine(); 
		
		// 알파벳 배열만들기
		char[] alphabet = new char[26];
		
		for(int i = 0; i<alphabet.length; i++) {
			alphabet[i] = (char)('a'+i);
			System.out.print(S.indexOf(alphabet[i]) + " ");

		}
		
	}

}
