package backjoon;

import java.util.Scanner;

public class backjoon_2920 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String array = null; 
		
		int[] list = new int[8];
		
		for(int i = 0; i < list.length; i++) {
			list[i] = Integer.parseInt(sc.next());
		}
		
		for(int i = 0; i < list.length; i++) {
			if(i == 7) break;
			if(list[i] == list[i+1]-1) {
				array = "ascending";
			} else if(list[i] == list[i+1]+1) {
				array = "descending";
			} else {
				array = "mixed";
				break;
			}
		}
		
		System.out.println(array);
		
	}

}
