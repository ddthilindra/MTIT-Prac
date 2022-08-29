import java.util.ArrayList;
import java.util.List;

interface ICalculateService {
	public int calculateTotal(List<Integer> listOfMarks);
}

//public class Ex2 implements ICalculateService {
//
//	public int calculateTotal(List<Integer> listOfMarks) {
//		int total = 0;
//		for (Integer mark : listOfMarks) {
//			total = total + mark;
//
//		}
//		return total;
//	}
//
//	public static void main(String[] args) {
//		Ex2 ex2 = new Ex2();
//
//		ArrayList<Integer> listOfMarks = new ArrayList<Integer>();
//		listOfMarks.add(85);
//		listOfMarks.add(75);
//		listOfMarks.add(60);
//		listOfMarks.add(80);
//		listOfMarks.add(100);
//
//		// Regulor impl
//		int total = ex2.calculateTotal(listOfMarks);
//		System.out.println("Total is = " + total);
//
//	}
//
//}

public class Ex2 {

	public static void main(String[] args) {
		Ex2 ex2 = new Ex2();

		ArrayList<Integer> listOfMarks = new ArrayList<Integer>();
		listOfMarks.add(85);
		listOfMarks.add(75);
		listOfMarks.add(60);
		listOfMarks.add(80);
		listOfMarks.add(100);

		ICalculateService iCalculateService = total -> listOfMarks.stream().mapToInt(Integer::intValue).sum();

		System.out.println("Total is = " + iCalculateService.calculateTotal(listOfMarks));

	}

}
