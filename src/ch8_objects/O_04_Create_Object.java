package ch8_objects;

public class O_04_Create_Object {

	public static void main(String[] args) {
		// create 1st object of class
		O_04_Create_Object o1 = new O_04_Create_Object();

		// create 2nd object of class
		O_04_Create_Object o2 = new O_04_Create_Object();

		// create reference of class and store 1st address of class
		O_04_Create_Object o3 = o1;

		System.out.println(o1 == o2);
		System.out.println(o1 == o3);
		System.out.println(o2 == o3);
	}
}
