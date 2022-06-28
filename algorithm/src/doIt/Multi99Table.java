package doIt;

public class Multi99Table {

	public static void main(String[] args) {
		System.out.println("---------구구단 곱셈표--------");
		for(int i = 1; i <= 9; i++) {
			for(int j = 1; j <=9; j++) {
				System.out.println(i + "x" + j + "=" + i*j);
				System.out.println();
			}
		}
		System.out.println("-----------구구단 표--------------");
		for(int i = 1; i <= 9; i++) {
			System.out.println();
			if(i != 1) {
			System.out.println("-----------------------------------------");
			}
			System.out.print("  " + i);
			for(int j = 1; j <=9; j++) {
				if (j == 1) {
					System.out.print("|");
				}
				System.out.print("  " + j*i);
			}
		}
		System.out.println();
		System.out.println();
		
		System.out.println("----------------덧셈표------------------");
		for (int i = 1; i <= 9; i++) {
			if (i != 1) {
				System.out.println("---------------------------------");
			}
			System.out.print("  " + i);
			for(int j = 1; j <= 9; j++) {
				if(j == 1) {
					System.out.print("|");
				}
				System.out.print(" " + (i+j));
			}
		}
		
	}

}
