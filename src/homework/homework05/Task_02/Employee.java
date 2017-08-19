package homework.homework05.Task_02;

public class Employee {

	private double daySalary;
	private String name;
	private Task currentTask;
	private int hoursLeft;
	private AllWork allwork;

	Employee(String name, int age, boolean isMale, double daySalary) {

		if (daySalary > 0) {
			this.daySalary = daySalary;
		} else {
			System.out.println("Please enter adequate value.");
		}
		this.name = name;
	}

	double getDaySalary() {
		return daySalary;
	}

	void setDaySalary(double daySalary) {
		this.daySalary = daySalary;
	}

	void work() {

		Task task;
		if (currentTask == null || currentTask.getWorkingHours() == 0) {
			task = allwork.getNextTask();
			if (task == null) {
				System.out.println("No more tasks available. Employee " + name + " is having a rest.");
				System.out.println("--------------------------------------------");
				return;
			} else {
				System.out.println("A new task assigned: " + task + ", employee in charge " + getName());
				currentTask = task;
			}
		} else {

			System.out.println(getName() + " continues task from yesterday: " + currentTask);
		}

		if (currentTask.getWorkingHours() >= hoursLeft) {
			currentTask.setWorkingHours(currentTask.getWorkingHours() - hoursLeft);
			hoursLeft = 0;
		} else {
			hoursLeft -= currentTask.getWorkingHours();
			currentTask.setWorkingHours(0);
		}

		if (hoursLeft > 0) {
			// Assign tasks for the day recursively
			this.work();
		} else {
			return;
		}

	}

	void startWorkingDay() {
		this.hoursLeft = 8;
	}

	public String getName() {
		return this.name;
	}

	Task getCurrentTask() {
		return this.currentTask;
	}

	void setCurrentTask(Task task) {
		this.currentTask = task;
	}

	int getHoursLeft() {
		return this.hoursLeft;
	}

	void setHoursLeft(int hoursLeft) {
		this.hoursLeft = hoursLeft;
	}

	AllWork getAllwork() {
		return this.allwork;
	}

	void setAllwork(AllWork allWork) {
		this.allwork = allWork;
	}
}
