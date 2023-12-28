package fitst;

public class Human {
	String name;
	int height;
	int weight;

}

class HumanTester {
	public static void main(String[] args) {
		Human gildong = new Human();
		Human chulsu = new Human();

		gildong.name = "길동";
		gildong.height = 180;
		gildong.weight = 70;

		chulsu.name = "철수";
		chulsu.height = 190;
		chulsu.weight = 90;

		System.out.println("이름:" + gildong.name);
	}
}
