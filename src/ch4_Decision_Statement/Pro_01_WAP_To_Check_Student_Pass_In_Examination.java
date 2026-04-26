package ch4_decision_Statement;

public class Pro_01_WAP_To_Check_Student_Pass_In_Examination {

	public static void main(String[] args) {
		int marks = 35;// local variable
		final int passingMarks = 35;// constant variable

		if (marks > passingMarks) {
			System.out.println("Student is passed in the examination");
		}
	}
}
