package implementation;

public class Checkout {

	private int total = 0;

	public void add(int count, int price) {
//		System.out.println("*** count is " + count + " price is " + price);
		total += price * count;
	}

	public int total() {
		return total;
	}
}
