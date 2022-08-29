import java.util.stream.IntStream;

public class Ex1b {

	public static void main(String[] args) {
		loopOldWay();
		System.out.println(  );
		loopNewWay();

	}
	
	public static void loopOldWay() {
		
		for (int num = 1; num <= 10; num++) {
			System.out.println("Loop old print "+ num);
		}
	}
	
	public static void loopNewWay() {
		IntStream.iterate(10, num -> num -1).limit(10).forEach(num -> System.out.println("Loop new print "+num));
	}

}
