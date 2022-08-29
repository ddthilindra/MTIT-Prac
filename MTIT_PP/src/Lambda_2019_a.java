import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import com.sun.jdi.DoubleValue;

interface ITrafficService {
	public String checkSpeed(List<Double> listOfCheckPoints);

//	default String msg(double speed) {
//		if (speed >= 100.0) {
//			return "Issue Fine";
//		} else if ((speed < 100.0) && (speed >= 80.0)) {
//			return "Warning message";
//		} else if ((speed < 80.0) && (speed >= 50.0)) {
//			return "Good speed";
//		} else if ((speed < 50.0) && (speed >= 30.0)) {
//			return "Normal";
//		} else {
//			return "Slow";
//		}
//	}

}

public class Lambda_2019_a {

	public static void main(String[] args) {
	
	ArrayList<Double> speedInCheckPoint = new ArrayList<>(); 
	speedInCheckPoint.add(20.0);
	speedInCheckPoint.add(30.0); 
	speedInCheckPoint.add(60.0); 
	speedInCheckPoint.add(80.0); 
	speedInCheckPoint.add(100.0); 
	speedInCheckPoint.add(120.0); 
	
	ITrafficService iTrafficService = totalSpeed -> {
		double averageSpeed = speedInCheckPoint.stream().mapToDouble(Double::doubleValue).sum()/(speedInCheckPoint.size());
		
		if(averageSpeed >= 100.0){ 
			return "Issue Fine"; 
		}else if((averageSpeed < 100.0) && (averageSpeed >= 80.0)){ 
			return "Warning message"; 
		}else if((averageSpeed < 80.0) && (averageSpeed >= 50.0)){ 
			return "Good speed"; 
		}else if((averageSpeed < 50.0) && (averageSpeed >= 30.0)){ 
			return "Normal"; 
		}else{
			return "Slow";
		}

	};
	
	System.out.println("Vehicle average status is in = "+iTrafficService.checkSpeed(speedInCheckPoint));
	
	}

}





//interface ITrafficService {
//	public String checkSpeed(List<Double> listOfCheckPoints);
//}
//
//public class Lambda_a_2019 implements ITrafficService {
//
//	public String checkSpeed(List<Double> listOfCheckPoints) { 
//		double total = 0; 
//		
//		for (Double speed : listOfCheckPoints) { 
//		total = total + speed; 
//		} 
//		
//		double averageSpeed = total/listOfCheckPoints.size(); 
//		if(averageSpeed >= 100.0){ 
//			return "Issue Fine"; 
//		}else if((averageSpeed < 100.0) && (averageSpeed >= 80.0)){ 
//			return "Warning message"; 
//		}else if((averageSpeed < 80.0) && (averageSpeed >= 50.0)){ 
//			return "Good speed"; 
//		}else if((averageSpeed < 50.0) && (averageSpeed >= 30.0)){ 
//			return "Normal"; 
//		}else{
//			return "Slow";
//		}
//	}
//
//	public static void main(String[] args) {
//		
//	
//	Lambda_a_2019 vehicleMonitor = new Lambda_a_2019(); 
//	ArrayList<Double> speedInCheckPoint = new ArrayList<>(); 
//	speedInCheckPoint.add(20.0);
//	speedInCheckPoint.add(30.0); 
//	speedInCheckPoint.add(60.0); 
//	speedInCheckPoint.add(80.0); 
//	speedInCheckPoint.add(100.0); 
//	speedInCheckPoint.add(120.0); 
//	String result = vehicleMonitor.checkSpeed(speedInCheckPoint); 
//	System.out.println("Vehicle average status is in = " + result); 
//	
//	}
//}

