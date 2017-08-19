package homework.homework02.Task_02;

public class College {

	public static void main(String[] args) {

		Student ivan = new Student("Ivan", "Finance", 25);
		ivan.grade = 5.5;
		ivan.upYear();
		ivan.upYear();
		Student maria = new Student("Maria","Economics", 23);
		maria.grade = 6;
		maria.receiveScholarship(5.5, 100);
		maria.upYear();
		Student petar = new Student("Petar", "Law", 21);
		petar.grade = 4.5;
		Student kiril = new Student("Kiril", "Tourism", 24);
		kiril.upYear();
		kiril.upYear();
		kiril.upYear();
		Student tanya = new Student("Tanya", "Law", 23);
		Student hristo = new Student("Hristo", "Finance", 20);
		Student krasi = new Student("Krasi", "Finance", 20);
		StudentGroup sgFinance = new StudentGroup("Finance");
		sgFinance.addStudent(ivan);
		sgFinance.addStudent(hristo);
		sgFinance.addStudent(krasi);
		sgFinance.addStudent(maria);
		sgFinance.addStudent(petar);
		StudentGroup sgLaw = new StudentGroup("Law");
		sgLaw.addStudent(petar);
		sgLaw.addStudent(tanya);
		System.out.println("The best student in the group Finance is: " + sgFinance.theBestStudent());
		System.out.println("The best student in the group Law is: " + sgLaw.theBestStudent());

		sgFinance.printStudentsInGroup();
		sgLaw.printStudentsInGroup();
	}

}
