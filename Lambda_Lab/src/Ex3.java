import java.util.ArrayList;
import java.util.List;

interface IAvarageService {
	public int getAvarage(List<Integer> listOfMarks);
}

//public class Ex3 {
//
//	public static void main(String[] args) {
//
//		
//		ArrayList<Integer> listOfMarks = new ArrayList<Integer>();
//		listOfMarks.add(90);
//		listOfMarks.add(80);
//		listOfMarks.add(70);
//		listOfMarks.add(60);
//		listOfMarks.add(100);
//
//		IAvarageService iAvarageService = total -> (listOfMarks.stream().mapToInt(Integer::intValue).sum())/(listOfMarks.size());
//		
//		System.out.println("Avarage is =" + iAvarageService.getAvarage(listOfMarks));
//		
//		
//	}
//
//}

public class Ex3 implements IAvarageService {
	@Override
	public int getAvarage(List<Integer> listOfMarks) {

		int total = 0;

		for (Integer mark : listOfMarks) {
			total = total + mark;
		}
		return (total / listOfMarks.size());
	}

	public static void main(String[] args) {
		
		Ex3 ex3 = new Ex3();

		ArrayList<Integer> listOfMarks = new ArrayList<Integer>();
		listOfMarks.add(90);
		listOfMarks.add(80);
		listOfMarks.add(70);
		listOfMarks.add(60);
		listOfMarks.add(100);

		

		System.out.println("Avarage is =" + ex3.getAvarage(listOfMarks));

	}

}
