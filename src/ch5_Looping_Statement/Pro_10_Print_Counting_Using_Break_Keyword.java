package ch5_Looping_Statement;

public class Pro_10_Print_Counting_Using_Break_Keyword {
	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);// print i if condition value as well.
			if (i == 4) {
				break;
			}
		}
	}
}