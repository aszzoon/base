package second;

public class Tennis {

	private String name;
	private int age;
	private int score;

	Tennis(String n, int a, int s) {
		name = n;
		age = a;
		score = s;
	}

	String getName() {
		return name;
	}

	int getAge() {
		return age;
	}

	int getScore() {
		return score;
	}

	void scoreAddRecord(int s) {
		score += s;
	}

	void scoreReduceRecord(int s) {
		score -= s;
	}
}
