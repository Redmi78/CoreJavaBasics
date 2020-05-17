package ControlStatements;

public class SelectionalStatements {

	public static void main(String[] args) {

		int a = 50, b = 30;
		if (a < b) {
			System.out.println("a is smaller than b");
		} else if (a > b) {
			System.out.println("a is greater than b");
		} else {
			System.out.println("both are equal");
		}
//Switch
		switch (a) {
		case 50:
			System.out.println("case 1");
			//break;
		case 30:
			System.out.println("case 2");
			break;
		default:
			System.out.println("default");

		}
		
		
		
	}

}
