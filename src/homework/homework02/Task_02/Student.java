package homework.homework02.Task_02;

public class Student {

	public String name;
	String subject;
	double grade;
	int yearInCollege;
	int age;
	private boolean isDegree;
	private double money;
	
	
	Student() {
		
		grade = 4.0;
		yearInCollege = 1;
		isDegree = false;
		money = 0;
		
	}
	
	Student(String name, String subject, int age) {
		
		this();
		this.name = name;
		this.subject = subject;
		this.age = age;
	}
	
	
	void upYear() {
		
		if(!isDegree) {
			yearInCollege++;
			isDegree = (yearInCollege == 4) ? true : false;
		} else {
			System.out.println("The student is in the last year of education.");
		}
	}
	
	double receiveScholarship(double min, double amount) {
		
		if((this.grade >= min) && (this.age < 30)) {
			money += amount;
		} 
		return money;	
	}
}
