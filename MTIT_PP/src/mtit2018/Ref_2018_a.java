package mtit2018;

import java.lang.reflect.Field;

public class Ref_2018_a {
	private final String employeeID; 
	private final double salary; 
	
	public Ref_2018_a() { 
		this.employeeID = "EMP3005"; 
		this.salary = 150000.00; 
	}
	
	public String toString() { 
		return "Employee = " + this.employeeID + " Salary " + this.salary; 		 
	}
	
	public static void main(String[] args) {
		Class<?> clazz; 
		try { 
			System.out.println("Before Reflection = " + new Ref_2018_a()); 
			
			//Engineer engineer = new Engineer();
			Ref_2018_a engineer = new Ref_2018_a();
			Class obj = engineer.getClass();
			
			Field field1 = obj.getDeclaredField("employeeID");
			Field field2 = obj.getDeclaredField("salary");
			
			field1.setAccessible(true);
			field2.setAccessible(true);
			
			field1.set(engineer, "EMPOBOO");
			field2.set(engineer, 0.0);
			
			System.out.println("After Reflection = "+engineer ); 
		} 
		catch (Exception e) { 
			e.printStackTrace(); 
		}

	}

}
