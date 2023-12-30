package second;

public class Music {

	private final String name;
	private final String company;
	private final String national;
	private final int price;
	private final int number;
	private final double time;

	public Music(String name, String company, String national, int price, int number, double time) {
		this.name = name;
		this.company = company;
		this.national = national;
		this.price = price;
		this.number = number;
		this.time = time;
	}

	double getTime() {
		return time;
	}

	void musicInfo() {
		System.out.println("이름" + name);
		System.out.println("소속사" + company);
		System.out.println("국적" + national);
		System.out.println("앨법가격" + price);
		System.out.println("멤버수" + number);
		System.out.println("음원길이" + time);
	}
}
