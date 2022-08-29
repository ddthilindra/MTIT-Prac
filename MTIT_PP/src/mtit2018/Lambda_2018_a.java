package mtit2018;
import java.util.ArrayList;
import java.util.List;

interface IGradeService {
	public String checkGrade(List<Integer> listOfMarks);
	
	
}

public class Lambda_2018_a  {

//	@Override
//	public String checkGrade(List<Integer> listOfMarks) {
//
//		int total = 0;
//		for (Integer mark : listOfMarks) {
//			total = total + mark;
//		}
//		double average = total / listOfMarks.size();
//		if (average >= 80.0) {
//			return "Best";
//		} else if ((average < 80.0) && (average >= 60.0)) {
//			return "Merit";
//		} else if ((average < 60.0) && (average >= 45.0)) {
//			return "Pass";
//		} else {
//			return "Fail";
//		}
//	}

	public static void main(String[] args) {
		Lambda_2018_a grade = new Lambda_2018_a(); 
		ArrayList<Integer> listOfMarks = new ArrayList<Integer>(); 
		listOfMarks.add(85); 
		listOfMarks.add(75); 
		listOfMarks.add(60); 
		listOfMarks.add(80); 
		listOfMarks.add(100); 
//		String result = grade.checkGrade(listOfMarks); 
//		System.out.println("Result is = " + result); 
		
		IGradeService iGradeService = result-> {
			int average = listOfMarks.stream().mapToInt(Integer::intValue).sum()/(listOfMarks.size());
			
			if (average >= 80.0) {
				return "Best";
			} else if ((average < 80.0) && (average >= 60.0)) {
				return "Merit";
			} else if ((average < 60.0) && (average >= 45.0)) {
				return "Pass";
			} else {
				return "Fail";
			}
		};
		
		System.out.println("Result is = " + iGradeService.checkGrade(listOfMarks)); 

	}

}
