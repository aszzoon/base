package second;

public class TennisPlayer {
	public static void main(String[] args) {
		Tennis nadal = new Tennis("nadal", 20, 100);

		nadal.scoreAddRecord(3);

		System.out.println(nadal.getScore());

	}
}
