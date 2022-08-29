import java.util.Iterator;
import java.util.stream.IntStream;

public class Ex4 {

	public static void main(String[] args) {
		
		System.out.println("Threads old approach");
		
		Runnable r1= new Runnable() {
			
			@Override
			public void run() {
				for (int i = 0; i <= 10; i++) {
					System.out.println("Threads old way : "+i);
				}
			}
		};
		
		new Thread(r1).start();
		
		System.out.println();
		
		//1st way
		
		System.out.println("Threads new approach");
		
		Runnable r2 =() ->{
			IntStream.iterate(0, i -> i+1).limit(10).forEach(i->{System.out.println("Runneble threads new way 1: "+i);});
		}; 
		
		new Thread(r2).start();
		
		//2nd way
		
		System.out.println();
		
		
		//new Thread( () -> IntStream.iterate(0, i -> i+1).limit(10).forEach(i->{System.out.println("Threads new way 2: "+i);})).start();

	}

}
