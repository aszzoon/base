package coordinate;

import java.util.Scanner;

public class CoordinateTester1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("좌표 p를 입력하세요.");

		System.out.println("X좌표:");
		double x = sc.nextDouble();

		System.out.println("y좌표:");
		double y = sc.nextDouble();

		Coordinate p = new Coordinate(x, y);
		System.out.println();

		Coordinate q = p;
		q.set(9.9, 9.9);
		System.out.println("p=(" + p.getX() + ", " + p.getY() + ") ");
		System.out.println("p=(" + p.getX() + ", " + p.getY() + ") ");
	}
}
