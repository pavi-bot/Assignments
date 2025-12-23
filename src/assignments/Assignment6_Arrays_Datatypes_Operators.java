package assignments;

public class Assignment6_Arrays_Datatypes_Operators {

	public static void main(String[] args) {
		// Create two arrays to store student names ["Suresh","Mahesh","Naresh"] and
		// marks [75, 80, 82] Add 10 marks to each students using assignment operators
		// and
		// store it into another array, after adding 10 marks identify the average marks
		// of all
		// students

		String[] names = { "Suresh", "Mahesh", "Naresh" };
		int[] marks = { 75, 80, 82 };

		int[] updatedMarks = new int[marks.length];

		// Adding Marks + 10
		for (int i = 0; i < marks.length; i++)
			updatedMarks[i] = (marks[i] + 10);
		for (int j = 0; j < marks.length; j++)
			System.out.println(updatedMarks[j]);

		// Assigning Updated marks to names
		for (int k = 0; k < names.length; k++)
			System.out.println(names[k] + " : " + updatedMarks[k]);

		// sum of updatedmarks
		int sum = 0;
		for (int i = 0; i < updatedMarks.length; i++) {
			sum += updatedMarks[i];
		}
		System.out.println("sum: " + sum);

		// Average of updated marks
		double average = sum / updatedMarks.length;
		System.out.println("Average: " + average);

	}

}
