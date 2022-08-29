@FunctionalInterface
interface MyFunctionalInterface{
	//A method with no parameter
	public String sayHello();
}

public class Ex1 {

	public static void main(String[] args) {
		//Lambda expression
		MyFunctionalInterface msg = () ->{return "Hello";};
		
		System.out.println(msg.sayHello());

	}

}
