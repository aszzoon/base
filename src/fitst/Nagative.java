package fitst;

import java.util.Scanner;

public class Nagative {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수값 입력해");
		int n = sc.nextInt();

		if (n < 0) {
			System.out.println("이 값은 음의 값입니다.");
		}
		else if (n > 0) {
			System.out.println("이 값은 양의 값입니다.");
		}
	}
}
