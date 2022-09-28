package mx.com.nath.main;

public class MainClass {

	public static void main(final String... args) {
		fibonacci(4_000_000L);
	}

	public static void fibonacci(final long limit) {
		long previous = 0;
		long current = 1;
		long sum = 0;
		while (previous <= limit && current <= limit) {
			current = current + previous;
			previous = current - previous;
			System.out.println(current + " " + previous);
			if (previous % 2 == 0) {
				sum += previous;
			}
		}
		System.out.println("SUM " + sum);
	}

}
