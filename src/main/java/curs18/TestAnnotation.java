package curs18;

public class TestAnnotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Tester tester = new Tester();
		Developer dev = new Developer();
		
		if(tester.getClass().isAnnotationPresent(MostImportant.class)) {
			System.out.println("This employee is very important!");
		}else {
			System.out.println("This employee is NOT very important!");
		}
	}

}
