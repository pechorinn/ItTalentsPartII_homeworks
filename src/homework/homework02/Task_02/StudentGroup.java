package homework.homework02.Task_02;

public class StudentGroup {

	public String groupSubject;
	private Student[] students;
	private int freePlaces;

	StudentGroup() {
		students = new Student[5];
		freePlaces = 5;
	}

	StudentGroup(String subject) {

		this();
		groupSubject = subject;
	}

	void addStudent(Student s) {
		if (freePlaces < 1) {
			return;
		}
		for (int i = 0; i < students.length; i++) {
			if (students[i] == null && s.subject == this.groupSubject) {
				students[i] = s;
				freePlaces--;
				break;
			}
		}
	}

	void emptyGroup() {

		students = new Student[5];
		freePlaces = 5;
	}

	String theBestStudent() {

		int index = 0;
		for (int i = 1; i < students.length; i++) {
			if (students[i] != null && (students[i].grade > students[index].grade)) {
				index = i;
			}
		}
		return students[index].name;
	}

	void printStudentsInGroup() {
		System.out.println("\nThe group's subject: " + this.groupSubject);
		for (Student st : students) {

			if (st != null) {
				System.out.println("Name: " + st.name + ", Grade: " + st.grade + ", Year in College: "
						+ st.yearInCollege + " Age: " + st.age);
			}
		}
	}
}
