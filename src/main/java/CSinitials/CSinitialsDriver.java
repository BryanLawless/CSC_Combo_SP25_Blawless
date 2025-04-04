import java.util.Scanner;

public class CSinitialsDriver {
	public static void main(String[] args) {
		CSinitials csInitialsInstance = new CSinitials();
		getData(csInitialsInstance);

		CSinitials csInitialsInstance2 = new CSinitials("CSC119631", 20, 30, "BP119", 3);
		getData(csInitialsInstance2);
	}

	public static void getData(CSinitials cs) {
		System.out.println(cs.toString());
	}

	public static void getInputData(CSinitials cs) {
		try (Scanner input = new Scanner(System.in)) {
			System.out.println("Enter course number: ");
			String courseNumber = input.nextLine();
			cs.setCourseNumber(courseNumber);

			System.out.println("Enter number of students: ");
			int students = input.nextInt();
			cs.setStudents(students);

			System.out.println("Enter max students: ");
			int maxStudents = input.nextInt();
			cs.setMaxStudents(maxStudents);

			System.out.println("Enter room number: ");
			String roomNumber = input.nextLine();
			cs.setRoom(roomNumber);

			System.out.println("Enter course credits: ");
			int credits = input.nextInt();
			cs.setCredits(credits);

		} catch (Exception e) {
			System.err.println(e);
		}
	}
}