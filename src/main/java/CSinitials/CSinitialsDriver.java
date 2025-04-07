import java.util.Scanner;

public class CSinitialsDriver {
	public static void main(String[] args) {
		CSinitials csInitialsInstance = new CSinitials();
		getData(csInitialsInstance);

		CSinitials csInitialsInstance2 = new CSinitials("CSC119631", 20, 30, "BP119", 3);
		getData(csInitialsInstance2);

		String[] a = {"a", "c", "x"};
		String[] b = {"b", "c", "d", "x", "y"};
		commonTwo(a, b);
	}

	public static void getData(CSinitials cs) {
		System.out.println(cs.toString());
	}

	public static int commonTwo(String[] a, String[] b) {
		int count = 0;
		int i = 0;
		int j = 0;
		String lastCommon = "";

		while (i < a.length && j < b.length) {
			if (a[i].compareTo(b[j]) < 0) {
				i++;
			} else if (a[i].compareTo(b[j]) > 0) {
				j++;
			} else {
				if (!a[i].equals(lastCommon)) {
					count++;
					lastCommon = a[i];
				}

				i++;
				j++;
			}
		}
		
		return count;
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