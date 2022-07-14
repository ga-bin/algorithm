package backjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

public class backjoon_2577 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// stringtokenizer
		int A = Integer.parseInt(br.readLine());
		int B = Integer.parseInt(br.readLine());
		int C = Integer.parseInt(br.readLine());
		
		String calcNum = Integer.toString(A*B*C);
		List<Integer> list = new ArrayList<>();
		
		for(int i = 0; i < calcNum.length(); i++) {
			list.add(Integer.parseInt(calcNum.substring(i, i+1)));
		}
		
		int[] count = new int[10];
	
		for(int i = 0; i < list.size(); i++) {
				count[list.get(i)] += 1;
			
		}
		for(int i : count) {
			System.out.println(i);
		}
		
		
	}

}
