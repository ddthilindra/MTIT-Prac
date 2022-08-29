package mtit2018;

import java.util.ArrayList;
import java.util.List;

interface IReference {
	void displayFruits();
}

public class Lambda_2018_c {

	public void displayFruits() {

		List<String> fruites = new ArrayList<String>();
		fruites.add("Apple");
		fruites.add("Orange");
		fruites.add("Pine-Apple");
		fruites.add("Banana");
		fruites.add("Mango");
		fruites.forEach(System.out::println);

	}

	public static void main(String[] args) {
//		Lambda_2018_c first = new Lambda_2018_c();
//
//		IReference iReference = first::displayFruits;
//		iReference.displayFruits();
		
		List<String> fruites = new ArrayList<String>();
		fruites.add("Apple");
		fruites.add("Orange");
		fruites.add("Pine-Apple");
		fruites.add("Banana");
		fruites.add("Mango");
		
		fruites.forEach(System.out::println);

	}
}
