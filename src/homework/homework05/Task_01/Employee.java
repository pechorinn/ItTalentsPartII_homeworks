package homework.homework05.Task_01;

class Employee {

	private String name;
	private Task currentTask;
	private int hoursLeft;

	Employee(String name) {
		this.name = name;
	}

	void work() {
		if (currentTask != null) {
			if (getCurrentTask().getWorkingHours() >= hoursLeft) {
				getCurrentTask().setWorkingHours(getCurrentTask().getWorkingHours() - hoursLeft);
				setHoursLeft(0);
				ShowReport();
			} else {
				setHoursLeft(hoursLeft - getCurrentTask().getWorkingHours());
				getCurrentTask().setWorkingHours(0);
				ShowReport();
			}
		} else {
			System.out.println("No task was assigned to the worker. Please assign task first.");
		}
	}

	void ShowReport() {
		System.out.println("Name: " + name);
		System.out.println("Task performed: " + getCurrentTask().getName());
		System.out.println("Hours left for the day: " + hoursLeft);
		System.out.println("Current hours remaining to complition of the task: " + getCurrentTask().getWorkingHours());
	}

	String getName() {
		return name;
	}

	void setName(String name) {
		if (name == null || name.isEmpty()) {
			System.out.println("Invalid input for name. Please try again.");
		} else {
			this.name = name;
		}
	}

	Task getCurrentTask() {
		return currentTask;
	}

	void setCurrentTask(Task currentTask) {
		this.currentTask = currentTask;
	}

	int getHoursLeft() {
		return hoursLeft;
	}

	void setHoursLeft(int hoursLeft) {
		if (hoursLeft < 0) {
			System.out.println("Please provide positive number for hours.");
		} else {
			this.hoursLeft = hoursLeft;
		}
	}

}
