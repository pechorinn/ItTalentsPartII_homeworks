package homework.homework04.Task_01;

public class Employee extends Person {

	private double daySalary;

	public Employee(String name, int age, boolean isMale, double daySalary) {
		super(name, age, isMale);
		if(daySalary > 0) { 
		this.daySalary = daySalary;
		} else {
			System.out.println("Please enter adequate value.");
		}
	}

	public double getDaySalary() {
		return daySalary;
	}

	public void setDaySalary(double daySalary) {
		this.daySalary = daySalary;
	}

	double calculateOvertime(double hours) {
		if (hours < 0) {
			System.out.println("Please enter positive value");
		}
		if (this.getAge() >= 18) {
			return hours * daySalary / 8 * 1.5;
		} else {
			return 0;
		}
	}

	void showEmployeeInfo() {

		super.showPersonInfo();
		System.out.println("Daily salary: " + daySalary);
		System.out.println();
	}
}
