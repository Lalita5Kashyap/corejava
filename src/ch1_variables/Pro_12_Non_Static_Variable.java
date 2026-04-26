package ch1_variables;

public class Pro_12_Non_Static_Variable {
	// non-static variable
	String name = "jimmy";

	public static void main(String[] args) {
		Pro_12_Non_Static_Variable na = new Pro_12_Non_Static_Variable();// create object to fetch non-static variable
		System.out.println(na.name);
	}
}
