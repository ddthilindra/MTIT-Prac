import java.util.ArrayList;
import java.util.List;

interface IVehiclel {
	void displayVehicles();
}

public class Lambda_2019_c {

	public static void main(String[] args) {
		IVehiclel iVehicle = () -> {
			List<String> vehicles = new ArrayList<String>();
			vehicles.add("Car");
			vehicles.add("Bus");
			vehicles.add("Van");
			vehicles.add("Jeep");
			vehicles.add("Lorry");
			vehicles.forEach((f) -> System.out.println(f));

		};
		System.out.println("Lambda \n");
		iVehicle.displayVehicles();
		
		List<String> vehicles = new ArrayList<String>();
		vehicles.add("Car");
		vehicles.add("Bus");
		vehicles.add("Van");
		vehicles.add("Jeep");
		vehicles.add("Lorry");
		
		System.out.println("\nMethod reference \n");
		
		vehicles.forEach(System.out::println);
	}
};
