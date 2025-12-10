package assignments;

public class Assignment2_Array3D {

	public static void main(String[] args) {
		// when we dont know the values
		String[][][] Semester = {
				// Semester 1
				{ { "Mathematics I", "Physics", "Chemistry", "Computer Programming", "Engineering Drawing",
						"Basic Electrical Eng" },
						{ "Pass(79)", "{Pass(78)", "Pass(85)", "Fail(21)", "Pass(74)", "Pass(88)" } },

				// Semester 2
				{ { "Mathematics II", "Mechanics", "Environmental Sci.", "Basic Electronics", "Engineering Physics",
						"Engineering Graphics" },
						{ "Pass(82)", "Pass(77)", "Pass(93)", "Fail(19)", "Fail(24)", "Pass(90)" } },

				// Semester 3
				{ { "Data Structures", "Discrete Mathematics", "Digital Electronics", "Operating Systems",
						"Signals and Systems", "Object-Oriented Prog." },
						{ "Pass(88)", "Pass(81)", "Pass(76)", "Fail(32)", "Pass(85)", "Pass(78)" } },

				// Semester 4
				{ { "Algorithms", "Computer Networks", "Database Systems", "Microprocessors", "Communication Eng.",
						"Software Engineering" },
						{ "Pass(91)", "Pass(73)", "Fail(19)", "Pass(80)", "Pass(76)", "Pass(87)" } },

				// Semester 5
				{ { "Probability & Stats", "Machine Learning", "Compiler Design", "Theory of Computation",
						"Embedded Systems", "Computer Graphics" },
						{ "Pass(86)", "Pass(88)", "Pass(84)", "Pass(95)", "Pass(73)", "Pass(90)" } }

		};

		System.out.println(Semester[4][1][0]);

		// when we know the values/index

		String[][][] Semester3D = new String[5][6][6];
		// Semester 1
		Semester3D[0][0][0] = "Mathematics I";
		Semester3D[0][0][1] = "Physics";
		Semester3D[0][0][2] = "Chemistry";
		Semester3D[0][0][3] = "Computer Programming";
		Semester3D[0][0][4] = "Engineering Drawing";
		Semester3D[0][0][5] = "Basic Electrical Eng.";
		Semester3D[0][1][0] = "Pass(79)";
		Semester3D[0][1][1] = "Pass(78)";
		Semester3D[0][1][2] = "Pass(85)";
		Semester3D[0][1][3] = "Fail(21)";
		Semester3D[0][1][4] = "Pass(74)";
		Semester3D[0][1][5] = "Pass(88)";

		// Semester 2
		Semester3D[1][0][0] = "Mathematics II";
		Semester3D[1][0][1] = "Mechanics";
		Semester3D[1][0][2] = "Environmental Sci.";
		Semester3D[1][0][3] = "Basic Electronics";
		Semester3D[1][0][4] = "Engineering Physics";
		Semester3D[1][0][5] = "Engineering Graphics";
		Semester3D[1][1][0] = "Pass(82)";
		Semester3D[1][1][1] = "Pass(77)";
		Semester3D[1][1][2] = "Pass(93)";
		Semester3D[1][1][3] = "Fail(19)";
		Semester3D[1][1][4] = "Fail(24)";
		Semester3D[1][1][5] = "Pass(90)";

		// Semester 3
		Semester3D[2][0][0] = "Data Structures";
		Semester3D[2][0][1] = "Discrete Mathematics";
		Semester3D[2][0][2] = "Digital Electronics";
		Semester3D[2][0][3] = "Operating Systems";
		Semester3D[2][0][4] = "Signals and Systems";
		Semester3D[2][0][5] = "Object-Oriented Prog.";
		Semester3D[2][1][0] = "Pass(88)";
		Semester3D[2][1][1] = "Pass(81)";
		Semester3D[2][1][2] = "Pass(76)";
		Semester3D[2][1][3] = "Fail(32)";
		Semester3D[2][1][4] = "Pass(85)";
		Semester3D[2][1][5] = "Pass(78)";

		// Semester 4
		Semester3D[3][0][0] = "Algorithms";
		Semester3D[3][0][1] = "Computer Networks";
		Semester3D[3][0][2] = "Database Systems";
		Semester3D[3][0][3] = "Microprocessors";
		Semester3D[3][0][4] = "Communication Eng.";
		Semester3D[3][0][5] = "Software Engineering";
		Semester3D[3][1][0] = "Pass(91)";
		Semester3D[3][1][1] = "Pass(73)";
		Semester3D[3][1][2] = "Fail(19)";
		Semester3D[3][1][3] = "Pass(80)";
		Semester3D[3][1][4] = "Pass(76)";
		Semester3D[3][1][5] = "Pass(87)";

		// Semester 5
		Semester3D[4][0][0] = "Probability & Stats";
		Semester3D[4][0][1] = "Machine Learning";
		Semester3D[4][0][2] = "Compiler Design";
		Semester3D[4][0][3] = "Theory of Computation";
		Semester3D[4][0][4] = "Embedded Systems";
		Semester3D[4][0][5] = "Computer Graphics";
		Semester3D[4][1][0] = "Pass(86)";
		Semester3D[4][1][1] = "Pass(88)";
		Semester3D[4][1][2] = "Pass(84)";
		Semester3D[4][1][3] = "Pass(95)";
		Semester3D[4][1][4] = "Pass(73)";
		Semester3D[4][1][5] = "Pass(90)";

	}

}
