import java.util.stream.IntStream;

//public class Lambda_2019_b implements Runnable {

public class Lambda_2019_b {

	public static void main(String[] args) {
//		Thread thread = new Thread(new Lambda_2019_b());
//		thread.start();

		Runnable r2 = () -> {
			IntStream.iterate(1, x -> x + 1).limit(5).forEach(x -> {
				IntStream.iterate(1, y -> y + 1).limit(5).forEach(y -> {
					System.out.print(y);
				});
				System.out.println();
			});

		};
		new Thread(r2).start();

	}

//	public void run() {
//		for (int row = 1; row <= 5; row++) {
//			for (int column = 1; column <= 5; column++) {
//				System.out.print(column);
//			}
//			System.out.println();
//		}
//	}

}
