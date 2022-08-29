package mtit2018;

import java.util.Iterator;
import java.util.stream.IntStream;

public class Lambda_2018_b implements Runnable{

	public static void main(String[] args) {
		
//		Runnable r2 = () -> {
//			IntStream.iterate(0, x -> x + 1).limit(10).forEach(x -> {
//				IntStream.iterate(0, y -> y + 1).limit(10).forEach(y -> {
//					System.out.print(y);
//				});
//				System.out.println();
//			});
//
//		};
//		new Thread(r2).start();
		
		Thread thread=new Thread(new Lambda_2018_b());
		thread.start();
		
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		
	}

}
