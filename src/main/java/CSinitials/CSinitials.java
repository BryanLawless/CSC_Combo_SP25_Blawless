public class CSinitials {
	String courseNumber;
	int students;
	int maxStudents;
	String room;
	int credits;

	public CSinitials() {
		this.courseNumber = "";
		this.students = 0;
		this.maxStudents = 0;
		this.room = "";
		this.credits = 0;
	}

    public CSinitials(String courseNumber, int students, int maxStudents, String room, int credits) {
		this.courseNumber = courseNumber;
		this.students = students;
		this.maxStudents = maxStudents;
		this.room = room;
		this.credits = credits;
	}

	public String getCourseNumber() {
        return courseNumber;
    }

    public void setCourseNumber(String courseNumber) {
        this.courseNumber = courseNumber;
    }

    public int getStudents() {
        return students;
    }

    public void setStudents(int students) {
        this.students = students;
    }

    public int getMaxStudents() {
        return maxStudents;
    }

    public void setMaxStudents(int maxStudents) {
        this.maxStudents = maxStudents;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    @Override
    public String toString() {
		String template = "Course Number: %s\nStudents: %d\nMax Students %d\nRoom: %s\nCredits: %d\n";

		return String.format(template, this.courseNumber, this.students, this.maxStudents, this.room, this.credits);
    }
}
