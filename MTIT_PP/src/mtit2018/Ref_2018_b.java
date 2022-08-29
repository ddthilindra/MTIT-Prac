package mtit2018;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Ref_2018_b {

	private static final String MUL = "*";
	private static final String DIV = "/";
	private static final double No1 = 100.00;
	private static final double No2 = 4.0;

	public void calculate(String sign) {
		if (MUL.equals(sign)) {
			System.out.println("Value = " + mul(No2, No1));
		} else if (DIV.equals(sign)) {
			System.out.println("Value = " + div(No2, No1));
		} else {

			System.out.println("Please enter correct sign * or /");
		}
	}

	public double mul(double nol, double no2) {
		return (nol * no2);
	}

	public double div(double nol, double no2) {
		return (nol / no2);
	}

	public static void main(String[] args) {
		System.out.println(MUL + "\n" + DIV + "\n" + No1 + "\n" + No2);

		Ref_2018_b caculator = new Ref_2018_b();
		caculator.calculate("*");
		
//		Class<?> clazz; 
//		try { 
//			//System.out.println("Before Reflection = " + new Ref_2018_a()); 
//			
//			//Engineer engineer = new Engineer();
//			Ref_2018_b engineer = new Ref_2018_b();
//			Class obj = engineer.getClass();
//			Class[] argTypes = new Class[] { String[].class };
//		    
//			Method main = obj.getDeclaredMethod("calculate", argTypes);
//			
//			
//			
//			System.out.println("invoking %s.main()%n"+ argTypes);			
//			
//			//System.out.println("After Reflection = "+engineer ); 
//			
//			
//		} 
//		catch (Exception e) { 
//			e.printStackTrace(); 
//		}
	}

}
