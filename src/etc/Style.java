package etc;

import java.util.Scanner;

public class Style {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a;
		int b;
		System.out.println("입력해봐 아무거나");
		a = sc.nextInt();

		for (a = 0; a < 3; ++a) {
			System.out.println(a + "b");
			for (b = 0; b < 100; ++b) {
				System.out.println(b);
			}
		}
	}
}
