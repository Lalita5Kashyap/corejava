package ch6_Array;

public class Pro_05_Create_An_Array_Without_New {

	public static void main(String[] args) {
		String flowers[] = { "rose", "lilly", "hibscus", "lotus" };
		for (int i = 0; i <= flowers.length - 1; i++) {
			System.out.println(flowers[i]);
		}
	}
}
