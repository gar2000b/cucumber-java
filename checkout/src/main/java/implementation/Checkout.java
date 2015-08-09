package implementation;

public class Checkout {

	private int total = 0;

	public void add(int count, int price) {
		total += price * count;
	}

	public int total() {
		return total;
	}
}
